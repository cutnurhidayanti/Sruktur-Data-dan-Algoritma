package tugas3.SortAlgoritm.advanceSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tugas3.Reqiurement.TimeInterval;

public class QuickSort {
    private static int arr[];
    private int n;
    private static int elemn;

    public QuickSort(int size) {
        this.arr = new int[size];
        this.n = 0;
        this.elemn = 0;
    }

    // method to find the partition position
    static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                compareCount();

                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    public void insert(int number) {
        arr[n] = number;
        n++;
    }

    public int size() {
        return n;
    }

    public int[] array() {
        return this.arr;
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int compareCount() {
        elemn++;
        return elemn;
    }
}

// Main class
class Main {
    public static void main(String args[]) {

        QuickSort obj = new QuickSort(100);
        TimeInterval ti = new TimeInterval();

        try {
            File myObj = new File("D:\\github\\Semester4\\SDA\\src\\tugas3\\FileTXT\\file100.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int number = Integer.parseInt(data);
                obj.insert(number);// add data to array
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Unsorted Array");
        obj.display();

        int size = obj.size();

        // call quicksort() on array data
        ti.startTiming();
        obj.quickSort(obj.array(), 0, size - 1);
        ti.endTiming();

        System.out.println("Sorted Array in Ascending Order: ");
        obj.display();
        System.out.println("\n<=========< Kompleksitas waktu Quicksort>=========>");
        System.out.printf("waktu pengurutan: " + ti.getElapsedTime() + " ms \n");
        System.out.printf("perbandingan dilakukan sebanyak: " + obj.compareCount() + " kali \n");
    }
}

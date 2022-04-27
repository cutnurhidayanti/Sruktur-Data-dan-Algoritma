package tugas3.SortAlgoritm;

// Shell sort in Java programming

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tugas3.kebutuhan.TimeInterval;

// Shell sort
class ShellSort {
    private static int arr[];
    private int n;

    public ShellSort(int size) {
        this.arr = new int[size];
        this.n = 0;
    }

    // Rearrange elements at each n/2, n/4, n/8, ... intervals
    void shellSort(int array[], int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
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

    // Driver code
    public static void main(String args[]) {

        ShellSort obj = new ShellSort(100);
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

        System.out.println("before sort");
        obj.display();

        ti.startTiming();
        int size = obj.size();
        ti.endTiming();

        obj.shellSort(obj.array(), size);

        System.out.println("after sort ");
        obj.display();
        System.out.println("\n<=========< Kompleksitas waktu Shellsort>=========>");
        System.out.printf("waktu pengurutan: " + ti.getElapsedTime() + " ms \n");
    }
}
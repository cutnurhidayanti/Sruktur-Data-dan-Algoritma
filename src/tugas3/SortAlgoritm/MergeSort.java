package tugas3.SortAlgoritm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tugas3.kebutuhan.TimeInterval;

public class MergeSort {
    private static int arr[];
    private int n;

    public MergeSort(int size) {
        this.arr = new int[size];
        this.n = 0;
    }

    // Merge two subarrays L and M into arr
    void merge(int arr[], int p, int q, int r) {

        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    // Divide the array into two subarrays, sort them and merge them
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {

            // m is the point where the array is divided into two subarrays
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted subarrays
            merge(arr, l, m, r);
        }
    }

    // Print the array
    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void insert(int number) {
        arr[n] = number;
        n++;
    }

    // Driver program
    public static void main(String args[]) {

        MergeSort obj = new MergeSort(100);
        TimeInterval ti = new TimeInterval();

        try {
            File myObj = new File("D:\\github\\Semester4\\SDA\\src\\tugas3\\FileTXT\\file100.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine() && (i <= arr.length)) {
                String data = myReader.nextLine();
                int number = Integer.parseInt(data);
                obj.insert(number);// add data to array
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("before sorted");
        obj.display();

        ti.startTiming();
        obj.mergeSort(arr, 0, arr.length - 1);
        ti.endTiming();

        System.out.println("after sorted:");
        obj.display();
        System.out.println("\n<=========< Kompleksitas waktu Mergesort>=========>");
        System.out.printf("waktu pengurutan: " + ti.getElapsedTime() + " ms \n");
    }
}

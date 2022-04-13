package Praktikum9;

import Praktikum2.TimeInterval;

/**
 * class yang mengimplementasikan merge sort
 */

public class MergeSortApp {
    public static void main(String[] ar) {
        int maxSize = 10; // array size
        Darray arr = new Darray(maxSize); // create the array
        TimeInterval ti = new TimeInterval();

        for (int i = 0; i < maxSize; i++) {
            double data;
            data = (int) (Math.random() * 100);
            arr.insert(data); // insert items
        }

        // arr.insert(12); // insert items
        // arr.insert(72); // insert items
        // arr.insert(82); // insert items
        // arr.insert(32); // insert items
        // arr.insert(17); // insert items
        // arr.insert(24); // insert items
        // arr.insert(53); // insert items
        // arr.insert(52); // insert items

        System.out.println("Data awal");
        arr.display(); // display items

        System.out.println();
        System.out.println("Data sesudah merge sort");

        ti.startTiming();
        arr.mergeSort(); // mergesort the array
        ti.endTiming();

        arr.display(); // display items again
        System.out.println("waktu pengerjaan : " + ti.getElapsedTime());
    }

}

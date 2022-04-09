package Praktikum9;

import Praktikum2.TimeInterval;

/**
 * class yang mengimplementasikan merge sort
 */

public class MergeSortApp {
    public static void main(String[] ar) {
        int maxSize = 100; // array size
        Darray arr; // reference to array
        arr = new Darray(maxSize); // create the array
        TimeInterval ti = new TimeInterval();

        arr.insert(64); // insert items
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36);
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

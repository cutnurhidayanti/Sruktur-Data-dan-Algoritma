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

        for (int i = 0; i < arr.size(); i++) {
            int data;
            data = (int) (Math.random() *100);
            arr.insert(data); // insert items
        }

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

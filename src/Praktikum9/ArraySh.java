package Praktikum9;

/**
 * class yang mengimplementasikan shell sort
 */

 import Praktikum9.Praktikum2.TimeInterval;

public class ArraySh {
    private double[] theArray; // ref to array theArray
    private int nElems; // number of data items

    public ArraySh(int max) // constructor
    {
        theArray = new double[max]; // create the array
        nElems = 0; // no items yet
    }

    public void insert(double value) // put element into array
    {
        theArray[nElems] = value; // insert it
        nElems++; // increment size
    }

    public void display() // displays array contents
    {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) // for each element,
            System.out.print(theArray[j] + " "); // display it
        System.out.println("");
    }

    public void shellSort() {
        int inner, outer;
        double temp;
        int h = 1; // find initial value of h

        while (h <= nElems / 3){
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < nElems; outer++) {
                temp = theArray[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            } // end for
            h = (h - 1) / 3; // decrease h
        } // end while(h>0)
    } // end shellSort()

    public static void main(String[] args) {

        int maxSize = 1000000; // array size
        ArraySh arr = new ArraySh(maxSize); // create the array

        TimeInterval ti = new TimeInterval();

        for (int j = 0; j < maxSize; j++) // fill array with
        { // random numbers
            double n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }
        arr.display(); // display unsorted array

        ti.startTiming();
        arr.shellSort(); // shell sort the array
        ti.endTiming();

        arr.display(); // display sorted array
        System.out.println("waktu yang diperlukan untuk melakukan sorting dengan ShellSort adalah : "+ti.getElapsedTime()+" ms");
    }
}

package Praktikum2;

public class InsertionSortApp {
    public static void main(String[] args) {

        int maxSize = 1000000; //ukuran array

        //mencipta objek arraytakterurut
        ArrayTakTerurut arrt = new ArrayTakTerurut(maxSize);

        //membuat objeck Timing interval
        TimeInterval ti = new TimeInterval();
        //masukkan 100 data acak ke dalam arrt
        for(int i=0; i<maxSize; i++){
            int x = 1 + (int) (Math.random() * 1000);
            arrt.insert(x);
        }

        //cetak sebelum diurutkan
        System.out.println("Data sebelum diurutkan:");
        arrt.display();

        //lakukan sort dengan bubbleSort
        ti.startTiming();
        arrt.insertionSort();
        ti.endTiming();

        //cetak sesudah diurutkan
        System.out.println("Data sesudah diurutkan:");
        arrt.display();

        System.out.println("<== METODE INSERTION SORT ==>");
        System.out.println("waktu yang diperoleh untuk mengurutkan "+maxSize+" adalah "+ti.getElapsedTime());
    }
}

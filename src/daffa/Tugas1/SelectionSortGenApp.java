package daffa.Tugas1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import daffa.Prak1.TimeInterval;

public class SelectionSortGenApp {
    public static void main(String[] args) throws Exception {
        // Membaca file
        File file = new File("Tugas1", "sgb-words.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Membuat objek StoreData yang akan menampung kata-kata dalam ArrayList
        StoreData<String> arr = new StoreData<>();

        // Variabel yang menampung data perkata
        String data = bufferedReader.readLine();

        // Membuat objek yang akan mengurutkan data dengan SelectionSortGeneric
        SortGeneric result = new SortGeneric();

        // Membuat objek TimeInterval
        TimeInterval ti = new TimeInterval();

        // Mengisi data
        while (data != null) {
            arr.addItem(data);
            data = bufferedReader.readLine();
        }

        // Mengurutkan data dengan algoritma bubble sort
        ti.startTiming();
        result.selectionSortGeneric(arr);
        ti.endTiming();

        // Mampilkan data yang sudah terurut
        arr.display();
        System.out.println("\n=========Kompleksitas waktu Selection Sort Generic=========");
        System.out.printf("Waktu yang diperlukan selection sort untuk mengurutkan kata: %.3f ms \n", (double) ti.getElapsedTime());
        bufferedReader.close();
    }
}
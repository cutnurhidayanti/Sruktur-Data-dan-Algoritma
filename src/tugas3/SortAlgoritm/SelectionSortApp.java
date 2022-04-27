package tugas3.SortAlgoritm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tugas3.kebutuhan.TimeInterval;

public class SelectionSortApp {
    public static void main(String[] args) throws Exception {

        Arrays arr = new Arrays(100);
        TimeInterval ti = new TimeInterval();

        // program to read
        try {
            File myObj = new File("D:\\github\\Semester4\\SDA\\src\\tugas3\\FileTXT\\file100.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int number = Integer.parseInt(data);
                arr.insert(number);// add data to array
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("data sebelum diurutkan");
        arr.display();

        // menghitung waktu pengurutan
        ti.startTiming();
        arr.selectionSort();
        ti.endTiming();

        // Mampilkan data
        System.out.println("data setelah diurutkan");
        arr.display();
        System.out.println("\n<=========< Kompleksitas waktu SelectionSort >=========>");
        System.out.printf("waktu pengurutan: " + ti.getElapsedTime() + " ms \n");
    }
}
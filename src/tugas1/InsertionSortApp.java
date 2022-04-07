package tugas1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class InsertionSortApp {
    public static void main(String[] args) throws Exception {
        // Membaca file
        File file = new File("D:\\github\\Semester4\\SDA\\src\\fixTugas1\\word.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Arrays arr = new Arrays(5757);
        String data = bufferedReader.readLine();
        TimeInterval ti = new TimeInterval();

        // Mengisi data
        int i = 0;
        while (data != null) {
            arr.insert(data);
            data = bufferedReader.readLine();
            i++;
        }

        // menghiting waktu pengurutan
        ti.startTiming();
        arr.insertionSort();
        ti.endTiming();

        // Mampilkan data
        arr.display();
        System.out.println("\n<=========< Kompleksitas waktu InsertionSort dengan Generic >=========>");
        System.out.printf("waktu pengurutan: "+ti.getElapsedTime()+" ms \n");
        bufferedReader.close();
    }
}

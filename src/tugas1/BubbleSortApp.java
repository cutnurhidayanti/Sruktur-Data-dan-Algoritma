package tugas1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BubbleSortApp {
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

        // ukur waktu pengurutan
        ti.startTiming();
        arr.bubbleSort();
        ti.endTiming();

        // data terurut
        arr.display();
        System.out.println("\n<=========< Kompleksitas waktu BubbleSort dengan Generic >=========>");
        System.out.printf("waktu pengurutan: "+ti.getElapsedTime()+" ms \n");
        bufferedReader.close();
    }
}

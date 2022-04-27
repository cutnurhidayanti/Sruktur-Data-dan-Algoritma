package tugas3.kebutuhan;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RandomCode {

    public static void main(String[] args) {

        // program to write
        try {
            Writer wr = new FileWriter("D:\\github\\Semester4\\SDA\\src\\tugas3\\FileTXT\\file500000.txt");

            int data;// memasukkan angka random kedalam array
            for (int i = 0; i < 500000; i++) {
                data = (int) (Math.random() * 1000);
                wr.write(new Integer(data).toString());
                wr.write("\n");
            }
            wr.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}

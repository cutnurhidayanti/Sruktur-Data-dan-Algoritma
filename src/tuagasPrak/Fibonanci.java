package tuagasPrak;

import java.util.Scanner;

/**
 * class ini digunakan untuk membuat angka Fibonanci
 */

public class Fibonanci {
    /**
     * @param param
     *              method yang digunakan untuk melakukan perhitungan Fibonanci
     */
    public void Menghitung(int param) {
        if (param > TETAPAN) {
            System.out.print("Maksimum ");
            System.out.print(TETAPAN);
            System.out.println(" bilangan!!!");
            return;
        }

        if (param < 1) {
            System.out.println("Harus bilangan bulat positif!!!");
            return;
        }

        System.out.print(param);
        System.out.println(" angka pertama deret Fibonanci:");

        System.out.print("1 ");
        if (param > 1) {
            System.out.print("1 ");
            if (param > 2) {
                int h = 1,
                        i = 1,
                        j = h + i;
                for (int K = 3; K <= param; ++K) {
                    j = h + i;
                    System.out.print(j);
                    System.out.print(" ");
                    h = i;
                    i = j;
                }
            }
        }
        System.out.println();
    }

    /**
     * variavel konstanta TETAPAN dengan nilai max
     */
    private static final int TETAPAN = 100;

    /**
     * program utama
     */

    static public void main() {
        System.out.print("Jumlah bilangan Fibonanci: ");
        Scanner input = new Scanner(System.in);
        int param = input.nextInt();

        Fibonanci E = new Fibonanci();
        E.Menghitung(param);
    }
}

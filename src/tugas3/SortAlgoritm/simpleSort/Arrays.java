package tugas3.SortAlgoritm.simpleSort;

public class Arrays {

    private int[] a;
    private int n;
    private int elemn;

    public Arrays(int max) {
        this.a = new int[max];
        this.n = 0;
        this.elemn = 0;
    }

    public int size() {
        return n;
    }

    public void insert(int number) {
        a[n] = number;
        n++;
    }

    // to show kata
    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubbleSort() {
        int out, in;
        for (out = n - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    compareCount();
                    swap(in, in + 1);
                }
            }

        }
    } // end bubbleSort()

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < n - 1; out++) {
            min = out;
            for (in = out + 1; in < n; in++) {
                if (a[in] < a[min]) {
                    compareCount();
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < n; out++) {

            double temp = a[out];
            in = out;

            while (in > 0 && a[in - 1] >= temp) {
                compareCount();
                a[in] = a[in - 1];
                --in;
            }
            a[in] = (int) temp;
        }
    }

    public int sequentSearch(double searchKey) {
        int nEl = n;
        int i = 0;

        while (i < nEl) {
            if (a[i] == searchKey) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void delete(int value) {
        int posisiIndeks = this.sequentSearch(value);
        if (posisiIndeks == n) {
            System.out.println("Posisi data yang dihapus tidak ditemukan.");

        } else {
            for (int i = posisiIndeks; i < n; i++) {
                a[posisiIndeks] = a[posisiIndeks + 1];
                n--;
            }
        }
    }

    public int compareCount() {
        elemn++;
        return elemn;
    }

}

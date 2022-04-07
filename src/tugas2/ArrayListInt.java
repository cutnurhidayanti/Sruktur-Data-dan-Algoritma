package tugas2;

public class ArrayListInt {
    private int[] array;
    private int[] arraytemp;
    private int[] arraytemporer;
    private static int size;
    private int index;
    // private static int isiArray;

    // method constructor
    public ArrayListInt(int size) {
        this.size = size;
        this.index = 0;
        array = new int[size];
    }

    // menambahkan nilai pada array
    public void addItem(int data, int index) {
        array[index] = data;
    }

    // menambahkan nilai di unjung array
    public void add(int x) {
        arraytemp = new int[size + 1];
        System.arraycopy(array, 0, arraytemp, 0, size);
        arraytemp[size] = x;
        this.size++;
        array = new int[size];
        System.arraycopy(arraytemp, 0, array, 0, size);
    }

    // menghapus seluruh item pada array
    public void clear() {
        size = 0;
        array = new int[size];
    }

    // menampilkan nilai yang ada pada array
    public void display() {
        for (int i = 0; i < size(); i++) {
            System.out.println(get(i));
        }
    }

    // mencari nilai x dan mereturn nilai bool
    public boolean constrain(int x) {
        int n = size;
        int i = 0;

        while (i < n) {
            if (array[i] == x) {
                return true;
            }
            i++;
        }
        return false;
    }

    // melihat nilai pada array index tertentu
    public int get(int index) {
        if (this.size > index) {
            return array[index];
        } else {
            return -1;// kembalikan nilai 1 jika index out of bound
        }
    }

    // mengembalikan index dari nilai array yang dicari
    public int indexOf(int x) {
        int n = size;
        int i = 0;

        while (i < n) {
            if (array[i] == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    // mengecek array kosong
    public boolean isEmpty() {
        return (size == 0);
    }

    // menghapus item pada array di index tertentu
    public int remove(int index) {
        if (index > size || index < 0) {
            return -1;// mengmbalikan nilai -1 untuk index out of bound
        } else {
            arraytemporer = new int[size];
            System.arraycopy(array, 0, arraytemporer, 0, size);
            arraytemp = new int[size - 1];
            // delete value
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    arraytemp[j++] = array[i];
                }
            }
            this.size--;
            array = new int[size];
            System.arraycopy(arraytemp, 0, array, 0, size);
            return arraytemporer[index];// return nilai
        }
    }

    // merubah nilai didalam arrray pada index tertentu
    public int set(int index, int x) {
        if (size > index) {
            return array[index] = x;
        } else {
            return -1;
        }
    }

    // melihat ukuran dari array
    public int size() {
        return this.size;
    }

}

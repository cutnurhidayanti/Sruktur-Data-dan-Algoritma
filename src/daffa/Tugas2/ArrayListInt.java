package daffa.Tugas2;

import daffa.Prak6.Node;

/**
 * Tugas 2 SDA
 * @author Daffa Mudhaffar
 * @since 27/03/2022
 */
public class ArrayListInt {
    private Node first;
    private Node last;
    private int size;
    private int index;

    /**
     * Constructor
     */
    public ArrayListInt() {
        first = null;
        last = null;
        size = 0;
        index = -1;
    }

    /**
     * Method untuk menambah nilai x di posisi indeks akhir
     * @param x Input nilai
     */
    public void add(int x) {
        // buat satu node baru
        Node nptr = new Node(x, null);

        if (isEmpty()) {
            first = nptr;
            last = nptr;
        } else {
            last.setLink(nptr);
            last = nptr;
        }
        size++;
        index++;
    }

    /**
     * Method untuk menghapus semua unsur dalam ArrayListInt
     */
    public void clear() {
        first = null;
        last = null;
        size = 0;
        index = -1;
    }

    /**
     * Method untuk mengecek nilai x ada di dalam ArrayListInt
     * @param x Input nilai
     * @return True jika nilai ada dalam ArrayListInt
     */
    public boolean contains(int x) {
        Node nptr = first;
        while (nptr != null) {
            if (nptr.getData() == x) {
                return true;
            }
            nptr = nptr.getLink();
        }
        return false;
    }

    /**
     * Method untuk mengembalikan nilai tertentu pada suatu indeks
     * @param indeks Indeks yang nilainya ingin dikembalikan
     * @return Nilai dari indeks
     */
    public int get(int indeks) {
        Node nptr = first;
        
        // Mengecek indeks agar tidak keluar dari range
        if (indeks < 0 || indeks >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            int i = 0;
            while (nptr != null) {
                if (i == indeks) {
                    return nptr.getData();
                }
                nptr = nptr.getLink();
                i++;
            }
        }
        return -1;
    }

    /**
     * Method untuk mengembalikan indeks pertama tempat nilai x ditemukan
     * @param x Input nilai yang ingin dikembalikan indeksnya
     * @return Indeks nilai x
     */
    public int indexOf(int x) {
        Node nptr = first;
        int index = 0;

        while (nptr != null) {
            if (nptr.getData() == x) {
                return index;
            }
            nptr = nptr.getLink();
            index++;
        }
        return -1;
    }

    /**
     * Method untuk mengembalikan apakah ArrayListInt kosong atau tidak
     * @return True jika kosong
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Method untuk mengeluarkan nilai pada indeks tertentu
     * @param indeks Indeks yang akan dikeluarkan
     */
    public void remove(int indeks) {
        // Mengecek indeks agar tidak keluar dari range
        if (indeks < 0 || indeks >= size()) {
            throw new IndexOutOfBoundsException();
        } else if (indeks == 0) { // hapus di awal
            first = first.getLink();
        } else if (indeks == size()-1) { // hapus di akhir
            Node temp = first;

            for (int i = 1; i < size()-1; i++) {
                temp = temp.getLink();
            }
            last = temp;
            last.setLink(null);
        } else {
            Node ptr = first;
            for (int i = 1; i <= indeks; i++) {
                if (indeks == i) {
                    Node temp = ptr.getLink();
                    temp = temp.getLink();
                    ptr.setLink(temp);
                    break;
                }
                ptr = ptr.getLink();
            }
        }
        size--;
    }

    /**
     * Method untuk mengubah nilai pada indeks tertentu menjadi nilai x
     * @param indeks Indeks yang akan diubah nilainya
     * @param x Nilai baru
     */
    public void set(int indeks, int x) {
        // Mengecek indeks agar tidak keluar dari range
        if (indeks < 0 || indeks >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Node ptr = first;
            for (int i = 0; i <= indeks; i++) {
                if (i == indeks) {
                    ptr.setData(x);
                    break;
                }
                ptr = ptr.getLink();
            }
        }
    }

    /**
     * Method untuk mengembalikan berapa banyak unsur yang tersimpan dalam ArrayListInt
     * @return Ukuran ArrayListInt
     */
    public int size() {
        return this.size;
    }
}
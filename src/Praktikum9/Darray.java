package Praktikum9;

// import Praktikum2.ArrayTakTerurut;
import Praktikum9.Praktikum2.Arrays;

public class Darray extends Arrays {
    private double[] a; // ref to array a
    private int nElems; // number of data items

    /**
     * Constructor for objects of class ArrayTakTerurut
     */
    public Darray(int max) {
        // initialise instance variables
        a = new double[max]; // create the array
        nElems = 0; // no items yet
    }

    // mengembalikan jumlah data yang ada dalam array
    public int size() {
        return nElems;
    }

    // menampilkan semua data dalam array
    public void display() {
        super.display(a, nElems);
    }

    // sequential searching. Mencari data dengan mencari data satu per satu
    public int sequentSearch(double searchKey) {
        int n = nElems;
        int i = 0;

        while (i < n) {
            if (a[i] == searchKey){
                return i;
            }
            i++;
        }

        return -1;
    }

    @Override
    public void insert(double value) {
        a[nElems] = value;
        nElems++;
    }

    @Override
    public void delete(double value) {
        int posisiIndeks = this.sequentSearch(value);

        if (posisiIndeks == nElems){
            System.out.println("Posisi data yang dihapus tidak ditemukan.");
        }else {
            // hapus data dengan menurunkan semua data
            for (int i = posisiIndeks; i < nElems; i++){
                a[posisiIndeks] = a[posisiIndeks + 1];
            }
            nElems--;
        }
    }

    // method mergesort utama yang akan dipanggil
    public void mergeSort() // called by main()
    { // provides workspace
        double[] workSpace = new double[nElems];
        recMergeSort(workSpace, 0, nElems - 1);
    }

    // method rekursif mergesort yang membagi dan merge
    private void recMergeSort(double[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound){// if range is 1,
            return; // no use sorting
        }else {
            // find midpoint
            int mid = (lowerBound + upperBound) / 2;

            // sort low half
            recMergeSort(workSpace, lowerBound, mid);

            // sort high half
            recMergeSort(workSpace, mid + 1, upperBound);

            // merge them
            merge(workSpace, lowerBound, mid + 1, upperBound);
        } // end else
    } // end recMergeSort
      // proses merge

    private void merge(double[] workSpace, int lowPtr,int highPtr, int upperBound) {
        int j = 0; // workspace index
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1; // # of items

        while (lowPtr <= mid && highPtr <= upperBound){
            if (a[lowPtr] < a[highPtr]){
                workSpace[j++] = a[lowPtr++];
            }else{
                workSpace[j++] = a[highPtr++];
            }
        }

        while (lowPtr <= mid){
            workSpace[j++] = a[lowPtr++];
        }

        while (highPtr <= upperBound){
            workSpace[j++] = a[highPtr++];

        }

        for (j = 0; j < n; j++){
            a[lowerBound + j] = workSpace[j];
        }
    } // end merge()

}

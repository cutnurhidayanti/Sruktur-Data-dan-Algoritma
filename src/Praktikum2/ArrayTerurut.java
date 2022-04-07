package Praktikum2;

public class ArrayTerurut extends Arrays{
    // instance variables - replace the example below with your own
    private double[] a; // ref to array a
    private int nElems; // number of data items

    /**
    * Constructor for objects of class ArrayTerurut
    */
    public ArrayTerurut(int max){
        // initialise instance variables
        a = new double[max]; // create the array
        nElems = 0; // no items yet
    }

    //mengembalikan jumlah data yang ada dalam array
    public int size(){
        return nElems;
    }

    //menampilkan semua data dalam array
    public void display(){
        super.display(a, nElems);
    }

    //binary searching. Mencari data dengan membagi dua
    public int binarySearch(double searchKey){
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true){
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn]==searchKey){
                return curIn; // found it else
            }if(lowerBound > upperBound){
                return nElems; // can't find it
            }else{
                if(a[curIn] < searchKey){
                    lowerBound = curIn + 1; // it's in upper half
                }else{
                    upperBound = curIn - 1; // it's in lower half
                } 
            } // end else divide range
        } // end while
    }

    @Override
    public void insert(double value){
        int j;
        for(j=0; j<nElems; j++){ // find where it goes
            if(a[j] > value){ // (linear/sequential search)
                break;
            }
        }
        /**
         * NAHH INI TOLONG DILIAT LAGI YAN
         */
        //naikkan ke atas dulu untuk memasukkan data
        for(int k=nElems; k>j; k--){
            a[k] = a[k-1];
        }

        a[j] = value; // insert it
        nElems++; // increment size
        
    }

    @Override
    public void delete(double value){
        int posisiIndeks = this.binarySearch(value);
        if(posisiIndeks == nElems){
            System.out.println("Posisi data yang dihapus tidak ditemukan.");
        }else{
            //hapus data dengan menurunkan semua data
            for(int i=posisiIndeks; i<nElems; i++){
                a[posisiIndeks] = a[posisiIndeks+1];
            }
            nElems--;
            /**
             * YAN YANG INI JUGAK PERLU DILIAT YAA
             */
        }
    }
}

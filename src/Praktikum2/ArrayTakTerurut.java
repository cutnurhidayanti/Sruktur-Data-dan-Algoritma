package Praktikum2;

public class ArrayTakTerurut extends Arrays {
    private double[] a; // ref to array a
    private int nElems; // number of data items
    /**
    * Constructor for objects of class ArrayTakTerurut
    */
    public ArrayTakTerurut(int max){
        // initialise instance variables
        a = new double[max]; // create the array
        nElems = 0; // no items yet
    }

    public void bubbleSort(){
        int out, in;
        for(out=nElems-1; out>1; out--){// outer loop (backward)
            for(in=0; in<out; in++){// inner loop (forward)
                if( a[in] > a[in+1] ){ // out of order?
                    swap(in, in+1);// swap them
                }
            } 

        } 
    } // end bubbleSort()

    public void selectionSort(){
        int out, in, min;
        for(out=0; out<nElems-1; out++){ // outer loop
            min = out; // minimum
            for(in=out+1; in<nElems; in++){// inner loop
                if(a[in] < a[min] ){// if min greater,
                    min = in; // we have a new min
                }
            } 
            swap(out, min); // swap them
        } // end for(outer)
    }//end selectionSort// inner loop

    public void insertionSort(){
        int in, out;
        for(out=1; out<nElems; out++){ // out is dividing line
            
            double temp = a[out]; // remove marked item
            in = out; // start shifts at out

            while(in>0 && a[in-1] >= temp){ // until one is smallerr
                a[in] = a[in-1]; // shift item right,
                --in; // go left one position
            }
            a[in] = temp; // insert marked item
        } // end for
    } // end insertionSort()
    
    private void swap(int one, int two){
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    //mengembalikan jumlah data yang ada dalam array
    public int size(){
        return nElems;
    }

    //menampilkan semua data dalam array
    public void display(){
        super.display(a, nElems);
    }

    //sequential searching. Mencari data dengan mencari data satu per
    public int sequentSearch(double searchKey){
        int n = nElems;
        int i = 0;
        
        while(i < n){
            if(a[i] == searchKey){
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
        public void insert(double value){
            a[nElems] = value;
            nElems++;
        }

    @Override
    public void delete(double value){
        int posisiIndeks = this.sequentSearch(value);
        if(posisiIndeks == nElems){
            System.out.println("Posisi data yang dihapus tidak ditemukan.");

        }else{
        //hapus data dengan menurunkan semua data
            for(int i=posisiIndeks; i<nElems; i++){
                a[posisiIndeks] = a[posisiIndeks+1];
                nElems--;
            }
        }
    }

    
}

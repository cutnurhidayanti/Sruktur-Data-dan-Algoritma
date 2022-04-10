package Praktikum9.Praktikum2;

public abstract class Arrays {
    // instance variables - replace the example below with your own
    //menampilkan semua data dalam array
    public void display(double[] a, int n){
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
        //method abstract untuk memasukkan data,
        //implementasinya pada subclass
        public abstract void insert(double value);
        
        //method abstract untuk menghapus data,
        //implementasinya pada subclass
        public abstract void delete(double value);
}

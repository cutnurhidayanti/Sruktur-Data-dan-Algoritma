package Praktikum2;

public class SearchingApp {
    public static void main(String[] args) {
        int maxSize = 100; //ukuran array
        double nilaiDicari = 8.0;
        int posisi = 0;

        //mencipta objek arrayterurut
        ArrayTerurut arr = new ArrayTerurut(maxSize);//masih bermasalah

        //mencipta objek arraytakterurut
        ArrayTakTerurut arrt = new ArrayTakTerurut(maxSize);

        //mencipta objek timeinterval untuk menghitung interval waktu
        TimeInterval ti = new TimeInterval();

        //masukkan 100 data terurut ke dalam arr
        int k = 1;
        for(int i=0; i<maxSize; i++){
            arr.insert(k);
            k++;
        }
        System.out.println("#isi array terurut");
        arr.display();

        //masukkan 100 data acak ke dalam arrt
        for(int i=0; i<maxSize; i++){
            int x = 1 + (int) (Math.random() * maxSize);
            arrt.insert(x);
        }
        System.out.println("#isi array tak terurut");
        arrt.display();

        //membuktikan kompleksitas waktu sequential search dan binarysearch
            ti.startTiming();
            posisi = arrt.sequentSearch(nilaiDicari);
            ti.endTiming();
            System.out.println("nilai yang dicari " +nilaiDicari+ " di posisi "+posisi);
            System.out.println("Waktu yang diperlukan oleh sequential search dalam mencari nilai "+nilaiDicari+" adalah " +ti.getElapsedTime());
            ti.startTiming();
            posisi = arr.binarySearch(nilaiDicari);
            ti.endTiming();
            System.out.println("nilai yang dicari " +nilaiDicari+ " di posisi "+posisi);
            System.out.println("Waktu yang diperlukan oleh binary search dalam mencari nilai "+nilaiDicari+"adalah "+ti.getElapsedTime());
        

        /*
        System.out.println("=================================");
        System.out.println("#setelah dihapus (array terurut)");
        arr.delete(15.0);
        arr.display();
        System.out.println("#setelah dihapus (array tak terurut)");
        arrt.delete(15.0);
        arrt.display();

        */
    }
}

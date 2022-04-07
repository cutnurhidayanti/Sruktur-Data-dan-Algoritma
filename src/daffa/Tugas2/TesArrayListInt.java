package daffa.Tugas2;

public class TesArrayListInt {
    public static void main(String[] args) {
        // Membuat objek ArrayListInt
        ArrayListInt arr = new ArrayListInt();

        // Menggunakan method add()
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(30);
        arr.add(20);
        arr.add(10);
        display(arr);

        // Menggunakan method contains()
        System.out.println("30 ada di dalam ArrayListInt? " + arr.contains(30));

        // Menggunakan method get()
        System.out.println("Nilai dari indeks ke-1 adalah : " + arr.get(1));

        // Menggunakan method indexOf()
        System.out.println("Indeks dari nilai 20 adalah : " + arr.indexOf(20));

        // Menggunakan method isEmpty()
        System.out.println("Apakah ArrayListInt kosong? " + arr.isEmpty());
    
        // Menggunakan method remove()
        arr.remove(5);
        display(arr);

        // Menggunakan method set()
        arr.set(1, 100);
        display(arr);

        // Menggunakan method size()
        System.out.println("Ukuran dari ArrayListInt sekarang adalah : " + arr.size());

        // Menggunakan method clear()
        arr.clear();
        display(arr);
    }

    // Fungsi untuk menampilkan isi ArrayListInt
    private static void display(ArrayListInt arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");
    }
}

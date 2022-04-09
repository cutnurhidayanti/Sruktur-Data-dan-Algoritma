package tugas2;

public class ArraylistApp {
    public static void main(String[] args) {
        ArrayListInt arr = new ArrayListInt(5);

        int data, element;// mengisi setiap index pada array
        for (int i = 0; i < arr.size(); i++) {
            data = (int) (Math.random() * 5);
            arr.addItem(data, i);
        }

        /**
         * untuk melihat method costrain
         */
        // arr.display();
        // System.out.println(arr.constrain(6));

        /**
         * untuk melihat method ger
         */
        // if (arr.get(2) == -1) {
        // System.out.println("index out of bound");
        // } else {
        // System.out.println("terdapat nilai" + arr.get(2) + "didalam array ");
        // }

        /**
         * untuk mwlihat method index of
         */
        // arr.display();
        // if(arr.indexOf(2) == -1){
        // System.out.println("tidak ada didalam array");
        // }else{
        // System.out.println("letak nilai x didalam array berada pada index
        // ke-"+arr.indexOf(2));
        // }

        /**
         * untuk nelihat method isEmpty
         */
        // System.out.println(arr.isEmpty());

        /**
         * untuk melihat method set
         */
        // arr.set(1, 5);
        // System.out.println("sesudah masuk program");
        // arr.display();

        /**
         * untuk melihat method ser
         */
        // if(arr.set(2, 2) == -1){
        // System.out.println("index out of bound");
        // }else{
        // arr.display();
        // }

        /**
         * untuk melihat method remove
         */
        // arr.display();
        // System.out.println("nilai array pada index ke 3 adalah : " + arr.remove(1));
        // arr.display();

        /**
         * untuk melihat method clear
         */
        // arr.display();
        // System.out.println("sesudah di hapus");
        // arr.clear();
        // arr.display();

    }
}

package tugas1;

public class Arrays {
    private String[] a;
    private int n;

    public Arrays(int max){
        a = new String[max];
        n = 0;
    }

    public int size(){
        return n;
    }

    public void insert(String value){
        a[n] = value;
        n++;
    }

    //to show kata
    public void display(){
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    private void swap(int one, int two){
        String temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public <T extends Comparable<? super T>> void bubbleSort() {
        int in, out;
        for (out = a.length-1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in].compareTo(a[in+1]) > 0) {
                    swap(in, in+1);
                }
            }
        }
    }

    public <T extends Comparable<? super T>> void selectionSort(){
        int out, in, min;
        for(out=0; out<a.length-1; out++){
            min = out; 
            for(in=out+1; in<a.length; in++){
                if(a[in].compareTo(a[min]) < 0){
                    min = in; 
                }
            } 
            swap(out, min); 
        } 
    }

    public <T extends Comparable<? super T>> void insertionSort(){
        int in, out;
        for(out=1; out<a.length; out++){ 
            
            String temp = a[out];
            in = out; 

            while(in>0 && a[in-1].compareTo(temp) >= 0){ 
                a[in] = a[in-1]; 
                --in; 
            }
            a[in] = temp; 
        } 
    }


}

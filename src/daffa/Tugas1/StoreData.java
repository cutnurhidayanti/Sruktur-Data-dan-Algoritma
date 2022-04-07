package daffa.Tugas1;

import java.util.ArrayList;

public class StoreData <T> {
    private ArrayList<T> arr;

    public StoreData() {
        arr = new ArrayList<>();
    }

    public void addItem(T item) {
        arr.add(item);
    }

    public T getItem(int index) {
        return arr.get(index);
    }

    public int getSize() {
        return arr.size();
    }

    public void setItem(int index, T element) {
        arr.set(index, element);
    }

    public void display() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }
    }
}
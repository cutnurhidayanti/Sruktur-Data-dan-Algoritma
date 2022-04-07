package daffa.Tugas1;

public class SortGeneric {
    public <T extends Comparable<? super T>> void bubbleSortGeneric(StoreData<T> arr) {
        int in, out;

        for (out = arr.getSize()-1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr.getItem(in).compareTo(arr.getItem(in+1)) > 0) {
                    swap(arr, in, in+1);
                }
            }
        }
    }

    public <T extends Comparable<? super T>> void selectionSortGeneric(StoreData<T> arr) {
        int smallIndex; // index of smallest element in the sublist
        int pass, j, n = arr.getSize();

        // pass has the range 0 to n-2
        for (pass = 0; pass < n-1; pass++) {
            // scan the sublist starting at index pass
            smallIndex = pass;
            // j traverses the sublist arr[pass+1] to arr[n-1]
            for (j = pass+1; j < n; j++) {
                // if smaller element found, assign smallIndex to that position
                if (arr.getItem(j).compareTo(arr.getItem(smallIndex)) < 0) {
                    smallIndex = j;
                }
                // swap the next smallest element into arr.getItem(pass)
                swap(arr, pass, smallIndex);
            }
        }
    }

    public <T extends Comparable<? super T>> void insertionSortGeneric(StoreData<T> arr) {
        int in, out;
        for (out = 1; out < arr.getSize(); out++) { // out is dividing line
            T temp = arr.getItem(out); // remove marked item
            in = out; // start shifts at out
            while (in > 0 && arr.getItem(in-1).compareTo(temp) >= 0) { // untill ont is smaller,
                arr.setItem(in, arr.getItem(in-1)); // shift item right,
                --in; // go left one position
            }
            arr.setItem(in, temp); // insert marked item
        }
    }

    private <T> void swap(StoreData<T> arr, int one, int two) {
        T temp;
        temp = arr.getItem(one);
        arr.setItem(one, arr.getItem(two));
        arr.setItem(two, temp);
    }

}
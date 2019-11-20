package io.github.komyagin.arrays.fizzarray2;

public class ArraysFizzArray {

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }
}

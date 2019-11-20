package io.github.komyagin.arrays.makelast;

public class ArraysMakeLast {

    public int[] makeLast(int[] nums) {
        int len = nums.length * 2;
        int last = nums[nums.length - 1];
        int[] arr = new int[len];
        arr[len - 1] = last;
        return arr;
    }
}

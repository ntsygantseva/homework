package io.github.komyagin.arrays.lucky13;

public class ArraysLuckyThirteen {

    public boolean lucky13(int[] nums) {
        boolean hasOne = false;
        boolean hasThree = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                hasOne = true;
            }
            if (nums[i] == 3) {
                hasThree = true;
            }
        }
        return !hasOne && !hasThree;
    }

}

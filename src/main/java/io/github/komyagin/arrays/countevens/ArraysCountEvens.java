package io.github.komyagin.arrays.countevens;

public class ArraysCountEvens {

    public int countEvens(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}

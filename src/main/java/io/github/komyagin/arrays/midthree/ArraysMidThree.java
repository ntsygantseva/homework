package io.github.komyagin.arrays.midthree;

public class ArraysMidThree {

    public int[] midThree(int[] nums) {
        int len = nums.length;
        return new int[]{nums[len / 2 - 1], nums[len / 2], nums[len / 2 + 1]};
    }
}

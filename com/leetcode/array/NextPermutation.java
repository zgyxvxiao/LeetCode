package com.leetcode.array;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int len =  nums.length;
        if(len==0 || len ==1){
            return;
        }


        int high = len-1;
        int low = len-2;
        int tmp = 0;
        while(high>low&&low>=0){
            if(nums[high]>nums[low]){
                tmp = nums[high];
                while(high>low){
                    nums[high] =  nums[high-1];
                    high--;
                }
                nums[low] = tmp;
                break;
            }
            else{
                low--;
                if(low == 0){
                    Arrays.sort(nums);
                }
            }
        }
    }
}

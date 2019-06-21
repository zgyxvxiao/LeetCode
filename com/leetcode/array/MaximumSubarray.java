package com.leetcode.array;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            for(int j= i; j< nums.length; j++){
                sum += nums[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum < nums[i]){
                sum = nums[i];
            }
            if(max<sum){
                max = sum;
            }

        }
        return max;
    }

    public static void main(String[] args) {
	// write your code here
    }
}

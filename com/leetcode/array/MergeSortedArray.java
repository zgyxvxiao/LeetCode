package com.leetcode.array;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num = m+n-1;
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(nums2[i]>nums1[j]){
                    nums1[num]=nums2[i];
                    break;
                }else{
                    nums1[num]=nums1[j];
                }
                num--;
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}

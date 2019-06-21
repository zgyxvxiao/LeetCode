package binarysearch;

import java.util.Arrays;
import java.util.HashMap;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length<=0){
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        for(int num: nums){

            map.put(num, i++);
        }
        Arrays.sort(nums);;
        int start = 0;
        int end =  nums.length-1;
        int mid = 0;
        while(start+1<end){
            mid = start+(end-start)/2;
            if(nums[mid]>target){
                end = mid;
            }else if(nums[mid]<target){
                start = mid;
            }else{

                return map.get(nums[mid]);
            }
        }

        if (nums[start] == target) {
            return map.get(nums[start]);
        }
        else if (nums[end] == target) {
            return map.get(nums[end]);
        }
        return -1;
    }
}

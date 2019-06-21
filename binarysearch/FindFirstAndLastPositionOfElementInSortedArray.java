package binarysearch;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int[] result = {-1, -1};
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                low = mid;
                break;
            } else if (nums[mid] < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        if (nums[low] == target) {
            result[0] = low;
            for(int i = low+1; i<nums.length; i++){
                if(nums[i]!= target){
                    result[1] = i-1;
                }
            }
        }

        return result;
    }
}
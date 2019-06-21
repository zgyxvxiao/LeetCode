package binarysearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }

        if (nums[start] > target) {
            return start;
        }
        if (nums[end] < target) {
            return end + 1;
        }

        if (nums[start] < target && target < nums[end]) {
            return start + 1;
        }
        return start;
    }
}

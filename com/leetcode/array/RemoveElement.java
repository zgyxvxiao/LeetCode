package com.leetcode.array;

public class RemoveElement {

    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        for(int j=1; j < nums.length; j++){
            if(nums[i] == val){
                nums[i] = nums[j];

            }else{
                i++;
                System.out.println(nums[i]);
            }

        }
        return i;
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) {

            int[] nums = {0,1,2,2,3,0,4,2};


            int ret = removeElement(nums, 2);
            String out = integerArrayToString(nums, ret);

            System.out.print(out);

    }
}

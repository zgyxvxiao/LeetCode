package twopointer_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            int sum = -nums[i];
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1,k = nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]>sum){
                    k--;
                }else if(nums[j]+nums[k]<sum){
                    j++;
                }else{
                    List<Integer> list =  new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;
                    while(j<nums.length && nums[j] == nums[j-1] ){
                        j++;
                    }
                    while( k>0 && nums[k] == nums[k+1] ){
                        k--;
                    }
                }
            }
        }

        return result;

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int l= i+1; l<nums.length; l++){
                if(l>0 && nums[l] == nums[l-1]){
                    continue;
                }
                int j=l+1,k = nums.length-1;
                int sum = -(nums[i]+nums[l] - target);
                while(j<k){
                    if(nums[j]+nums[k]>sum){
                        k--;
                    }else if(nums[j]+nums[k]<sum){
                        j++;
                    }else{
                        List<Integer> list =  new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[l]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        result.add(list);
                        j++;
                        k--;
                        while(j<nums.length && nums[j] == nums[j-1] ){
                            j++;
                        }
                        while( k>0 && nums[k] == nums[k+1] ){
                            k--;
                        }
                    }
                }
            }
        }

        return result;

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

    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);

            List<List<Integer>> ret = new ThreeSum().threeSum(nums);

            String out = int2dListToString(ret);

            System.out.print(out);
        }
    }
}
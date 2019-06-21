package twopointer_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int distance = Integer.MAX_VALUE;
        HashMap<Integer, Integer> sum =  new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1,k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]>target){
                    k--;
                }else if(nums[i]+nums[j]+nums[k]<target){
                    j++;
                }else{
                    return target;
                }

                if(distance>Math.abs(nums[i]+nums[j]+nums[k] - target)){
                    distance = Math.abs(nums[i]+nums[j]+nums[k] - target);
                    sum.put(distance, nums[i]+nums[j]+nums[k]);
                }
            }
        }

        return sum.get(distance);

    }
}

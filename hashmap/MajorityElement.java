package hashmap;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        if(nums.length == 1)
            return num[0];
        for (int num : nums) {
            if (result.containsKey(num)) {
                int flag = result.get(num);
                flag++;
                if (flag > nums.length / 2) {
                    return num;
                }
                result.replace(num, flag);
            } else {
                result.put(num, 1);
            }
        }
        return 0;
    }
}

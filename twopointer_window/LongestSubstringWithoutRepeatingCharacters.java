package twopointer_window;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()<=0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }

        int slow = 0;
        int fast = 0;
        int max = 0;

        HashSet<Character> set =  new HashSet<Character>();

        for(fast = 0; fast<s.length(); fast++){
            if(set.contains(s.charAt(fast))){
                max = Math.max(max, fast - slow);
                while(s.charAt(slow) != s.charAt(fast)){
                    set.remove(s.charAt(slow));
                    slow++;
                }
                slow++;
            }else{
                set.add(s.charAt(fast));
            }
        }
        max = Math.max(max, fast - slow);
        return max;
    }
}

package twopointer_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int slow = 0;
        int fast = 0;
        int max = 0;
        String result = null;
        HashSet<Character> set = new HashSet<Character>();
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for (fast = 0; fast < s.length(); fast++) {
            if (set.contains(s.charAt(fast))) {
                while (s.charAt(slow) != s.charAt(fast)) {
                    set.remove(s.charAt(slow));
                    slow++;
                }
                max = Math.max(max, fast - slow);
                map.put(max, s.substring(slow, fast));
                slow++;
            } else {
                set.add(s.charAt(fast));
            }
        }
        return map.get(max);
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int begin = 0;
        int length = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                if(i==0){
                    dp[j][j+i] = true;
                }else if(i==1 && s.charAt(j) == s.charAt(j+i)){
                    dp[j][j+i] = true;
                }
                else if (s.charAt(j) == s.charAt(j+i) && dp[j + 1][j + i - 1]) {
                    dp[j][j+i] = true;
                }else{
                    dp[j][j+i] = false;
                }
                if (dp[j][j+i] == true) {
                    if (j >= length) {
                        System.out.println(j+"---"+i);
                        length = i+1;
                        begin = j;
                    }
                }
            }
        }
        return s.substring(begin, length);
    }
}

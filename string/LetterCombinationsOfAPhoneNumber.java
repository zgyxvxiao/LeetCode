package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<String>();
        }
        List<String> list  = new ArrayList<String>();
        HashMap<Integer, String> map =  new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        char[] array = digits.toCharArray();
        String top = map.get(array[0]-'0');
        for(int i=0; i<top.length(); i++){
            helper(map, array, 1, String.valueOf(top.charAt(i)), list);
        }
        return list;
    }

    public void helper(HashMap<Integer, String> map, char[] array, int count, String result, List<String> list){
        if(count>=array.length){
            list.add(result);
            return;
        }
        String mid = map.get(array[count]-'0');
        for(int k=0; k<mid.length();k++){
            helper(map, array, count+1, result+mid.charAt(k), list);
        }
    }
}

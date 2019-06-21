package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams1(String s, String p) {
        List<Integer> result =  new ArrayList<Integer>();
        HashMap<Character, Integer> pmap = new HashMap<Character,Integer>();
        for(int i = 0; i<p.length(); i++){
            if(pmap.containsKey(p.charAt(i))){
                int n = pmap.get(p.charAt(i));
                pmap.put(p.charAt(i), n++);
            }else{
                pmap.put(p.charAt(i), 0);
            }

        }


        for(int i = 0; i<s.length()-p.length(); i++){
            HashMap<Character, Integer> smap = new HashMap<Character,Integer>();
            for(int j = i; j<i+p.length()-1; j++){
                if(smap.containsKey(s.charAt(j))){
                    int n = smap.get(s.charAt(j));
                    smap.put(s.charAt(j), n++);
                }else{
                    smap.put(s.charAt(j), 0);
                }
            }

            if(smap.equals(pmap)){
                result.add(i);
            }
        }
        return result;

    }

    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> result =  new ArrayList<Integer>();
        int totalP = 0;
        for(int i = 0; i<p.length(); i++){
            totalP += p.charAt(i) - '0';
        }

        for(int i = 0; i<s.length()-p.length(); i++){
            int totalS = 0;
            int temp = i;
            for(int j = 0; j<p.length(); j++){
                totalS +=  s.charAt(i) - '0';
                i++;
            }
            i = temp;
            if(totalS == totalP){
                result.add(i);
            }

        }
        return result;
    }


    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result =  new ArrayList<Integer>();
        char[] pList =  new char[26];


        int totalP = 0;
        for(int i = 0; i<p.length(); i++){
            pList[p.charAt(i) - 'a'] = p.charAt(i);
        }

        for(int i = 0; i<s.length()-p.length(); i++){
            char[] sList =  new char[26];
            for(int j = i; j<i+p.length()-1; j++){
                sList[s.charAt(j) - 'a'] = s.charAt(j);
            }

            for(int k = 0; k<26; k++){
               if(pList[k] != sList[k]){
                   break;
               }else{
                   if(k==25)
                        result.add(i);
               }
            }

        }
        return result;
    }
}

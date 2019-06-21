package string;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        if(haystack.isEmpty()){
            return -1;
        }

        if(needle.length()>haystack.length()){
            return -1;
        }

        if(needle.length()==haystack.length()){
            if(needle.equals(haystack)){
                return 0;
            }else{
                return -1;
            }
        }

        int low = -1;
        int high = -1;

        for(int i=0,j=haystack.length(); i<j-needle.length(); i++,j--){
            if(needle.equals(haystack.substring(i, i+needle.length()))){
                low = i;
                return low;
            }
            if(needle.equals(haystack.substring(j-needle.length(), j))){
                high = j-needle.length();
            }

        }
        if(low == -1 && high == -1){
            return -1;
        }
        if(low == -1 || high == -1){
            return Math.max(low, high);
        }

        return Math.min(low, high);
    }
}

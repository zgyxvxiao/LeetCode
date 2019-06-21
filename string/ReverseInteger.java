package string;

import java.util.Arrays;

public class ReverseInteger {
    public int reverse(int x) {
        String buff = Integer.toString(x);
        StringBuffer result = new StringBuffer();
        if(buff.charAt(0)=='-'){
            result.append('-');
        }
        for(int i = buff.length()-1; i>=0; i--){
            if(buff.charAt(i)=='-'){
                continue;
            }
            result.append(buff.charAt(i));
        }
        long ret = 0;
        if(result.charAt(0)=='-'){
            ret = Long.parseLong(result.toString().substring(1))/-1;
        }else{
            ret =  Long.parseLong(result.toString());
        }
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
            return 0;
        }

        if(result.charAt(0)=='-'){
            return Integer.parseInt(result.toString().substring(1))/-1;
        }else{
            return  Integer.parseInt(result.toString());
        }
    }
}

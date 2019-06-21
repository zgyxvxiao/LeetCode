package string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result =  new ArrayList<String>();
        String buff =  new String();
        helper(result, 0, 0, n, buff);
        return result;

    }

    public void helper(List<String> result, int left, int right, int n, String buff){

        if(left>n || left<right){
            return;
        }
        if(buff.length() == 2*n){
            result.add(buff);
            return;
        }
        System.out.println(left+"-----"+right);
        System.out.println(buff);
        helper(result, left+1, right, n, buff+"(");
        helper(result, left, right+1, n, buff+")");
    }
}

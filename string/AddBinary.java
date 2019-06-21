package string;

import java.util.Stack;

public class AddBinary {
    public String addBinary(String a, String b) {
        Stack<Integer> stack =  new Stack<Integer>();
        int sum = 0;
        for(int i = a.length()-1, j = b.length()-1; i>=0 || j>=0; i--, j--){
            int num1 = 0;
            int num2 = 0;

            if(i>=0){
                num1 =  a.charAt(i) - '0';
            }
            if(j>=0){
                num2 =  a.charAt(j) - '0';
            }
            sum = num1 + num2 + sum;
            if(sum == 0){
                stack.push(sum);
                sum = 0;
            }else if(sum == 1){
                stack.push(sum);
                sum = 0;
            }else if(sum == 2){
                stack.push(0);
                sum = 1;
            }else {
                stack.push(1);
                sum = 1;
            }
        }
        if(sum == 1){
            stack.push(sum);
        }
        StringBuilder result =  new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();

    }
}

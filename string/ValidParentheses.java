package string;

public class ValidParentheses {
    public boolean isValid(String s) {
        boolean result =  false;
        if(s.length()==0){
            return true;
        }
        for(int i=0; i<s.length(); i++){
            int count = 0;
            if(s.charAt(i) != '(' && s.charAt(i) != '[' && s.charAt(i) != '{'){
                continue;
            }
            result =  false;
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{'){
                    count++;
                }else{
                    System.out.println(i + "------" + count);
                    if(i+count*2-1 >= s.length()){
                        return false;
                    }
                    if(s.charAt(i) == '(' && s.charAt(i+count*2-1) == ')'){
                        result =  true;
                        break;
                    }
                    if(s.charAt(i) == '[' && s.charAt(i+count*2-1) == ']'){
                        result =  true;
                        break;
                    }
                    if(s.charAt(i) == '{' && s.charAt(i+count*2-1) == '}'){
                        result =  true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}

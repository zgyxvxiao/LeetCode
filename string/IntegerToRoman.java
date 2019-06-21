package string;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String temp = Integer.toString(num);
        StringBuffer result = new StringBuffer();
        int len = temp.length();
        for(int i=0; i<len; i++){
            if(len == 4 && i ==0){
                char tmp = temp.charAt(0);
                if(tmp == '4'){
                    result.append("CD");
                }else if(tmp == '9'){
                    result.append("CM");
                }
                else if(tmp == '1'){

                }
            }
        }
    }
}

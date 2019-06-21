package string;

public class CountAndSay {
    public String countAndSay(int n) {
        int result = 0;
        if(n >= 1){
            result = 1;
        }
        String temp = Integer.toString(result);

        for(int i=2; i<=n; i++){
            int count = 1;
            StringBuffer temp1 = new StringBuffer();

            for(int j=0; j<temp.length(); j++){
                if(j+1 == temp.length()){
                    temp1.append(Integer.toString(count));
                    temp1.append(temp.charAt(j+1));
                    break;

                }
                if(temp.charAt(j) == temp.charAt(j+1)){
                    count++;
                }else{
                    temp1.append(Integer.toString(count));
                    temp1.append(temp.charAt(j));
                    count = 1;
                }

            }
            temp = temp1.toString();
        }

        return temp;
    }
}

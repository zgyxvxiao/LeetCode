package dp;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String buff = Integer.toString(x);
        int j = buff.length();
        for(int i=0; i<=j; i++,j--){
            if(buff.charAt(i) != buff.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome1(int x) {
        if(x<0){
            return false;
        }
        int y = x;
        int reverse = 0;
        while(x>0){
            reverse = reverse*10 + x%10;
            x=x/10;
        }
        if(reverse == y)
            return true;
        else
            return false;
    }
}

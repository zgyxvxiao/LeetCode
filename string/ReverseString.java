package string;

public class ReverseString {
    public void reverseString(char[] s) {
        for(int i = 0, j= s.length -1; i<=j; i++,j--){
            char temp = s[0];
            s[0] = s[j];
            s[j] = temp;
        }
    }
}

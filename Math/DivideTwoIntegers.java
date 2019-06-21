package Math;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int sum = dividend;
        int result = 0;
        while(true){
            sum = Math.abs(sum) - Math.abs(divisor);
            if(sum>0){
                break;
            }
            result++;
            if(result == Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        if((dividend>0&& divisor>0) || (dividend<0&& divisor<0))
            return result;
        return -result;
    }
}

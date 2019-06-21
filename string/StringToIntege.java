package string;

import java.util.HashSet;

public class StringToIntege {
    public int myAtoi(String str) {
        int div = 1;
        int integral = 0;
        if (str.isEmpty()) {
            return 0;
        }
        str = str.trim();
        if (str.charAt(0) == '+') {
            str = str.substring(1);

        } else if (str.charAt(0) == '-') {
            str = str.substring(1);
            div = -1;
        } else if (str.charAt(0) - '0' > 9) {
            return 0;
        }
        if (str.isEmpty()) {
            return 0;
        }

        StringBuffer result = new StringBuffer();
        long number = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                break;
            }
            if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
                integral = 1;
                //result.append(str.charAt(i));
                number = number * 10 + (str.charAt(i) - '0');
                if (div == 1 && number > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if(div == -1 && number/div < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
            if (str.charAt(i) - '0' > 9) {
                if (integral == 0) {
                    return 0;
                } else {
                    break;
                }
            }
        }
        /*
        long number = Long.parseLong(result.toString()) / div;
        if (number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        */
        return (int)number/div;
    }

}

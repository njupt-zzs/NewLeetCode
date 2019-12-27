package com.gczx.string;

/**
 * @authoor zzs
 * @create 2019-12-22 20:59
 */

public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int count = 0;
        while (i >= 0 || j >= 0 || count != 0){
            if (i >= 0)
                count += num1.charAt(i--) - '0';
            if (j >= 0)
                count += num2.charAt(j--) - '0';
            stringBuilder.append(count % 10);
            count /= 10;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("1234", "56"));
    }
}

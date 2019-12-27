package com.gczx.string;

/**
 * @authoor zzs
 * @create 2019-12-22 20:30
 */
public class StringToInteger {  //并没有考虑越界
    public int reverse(String s){
        int result = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(0) == '-'){
                flag = true;
                continue;
            }
            result = result * 10 + s.charAt(i) - '0';

        }
        if (flag)
            result = result * (-1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new StringToInteger().reverse("-4567"));

    }
}

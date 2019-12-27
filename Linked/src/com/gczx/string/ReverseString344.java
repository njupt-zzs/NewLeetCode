package com.gczx.string;

/**
 * @authoor zzs
 * @create 2019-12-22 15:20
 */
public class ReverseString344 {
    public String  reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;

        }
        return new String(s);
    }


    public String reverseString1(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        char [] c = {'a','b','c'};
        System.out.println(c.length);
        // System.out.println(new ReverseString344().reverseString(c));
        String str = "abc123";
        //System.out.println(str.getBytes().length);   //这是变为字节数组
        System.out.println(new ReverseString344().reverseString1(str));
    }
}

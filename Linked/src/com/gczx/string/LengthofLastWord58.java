package com.gczx.string;

/**
 * @authoor zzs
 * @create 2019-12-22 16:44
 */
public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        if (s == null)
            return 0;
        int count = 0;
        String s1 = s.trim();
        int j = s1.length() - 1;
        while (s1.charAt(j--) != ' ')
            count++;

        return count;
    }

    public static void main(String[] args) {
       // System.out.println(new LengthofLastWord58().lengthOfLastWord("  abc   c da  "));
        String str = "-123";
        System.out.println(Integer.parseInt(str));
    }
}

package com.gczx.zzs;

/**
 * @authoor zzs
 * @create 2019-12-19 11:28
 */
public class PalindromeNumber009 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int n = x;
        //想办法一次遍历来实现
        int res = 0;
        while (n != 0){
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res == x;
    }

    public static void main(String[] args) {
        PalindromeNumber009 number009 = new PalindromeNumber009();
        System.out.println(number009.isPalindrome(123432));
    }
}

package com.gczx.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @authoor zzs
 * @create 2019-12-19 8:55
 */
public class LongestSubstring003 {
    public int lengthOfLongestSubstring(String s) {
       //使用HashSet
        int n = s.length();
        int i = 0;
        int j = 0;
        int res = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (i < n && j < n){
            if (!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j++));
                res = Math.max(res,j - i + 1);
            }
            else
                hashSet.remove(i++);
        }
        return res;
    }

    public static void main(String[] args) {
        LongestSubstring003 longestSubstring003 = new LongestSubstring003();
        System.out.println(longestSubstring003.lengthOfLongestSubstring("abcabcdd"));
    }
}

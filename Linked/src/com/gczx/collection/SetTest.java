package com.gczx.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @authoor zzs
 * @create 2019-12-21 9:04
 */
public class SetTest {

    private int a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetTest setTest = (SetTest) o;

        if (a != setTest.a) return false;
        return b == setTest.b;

    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    private int b;


    public static void main(String[] args) {


        String str1 = "abcbde";

        System.out.println(str1.indexOf(98));
        String str2 = "de";


        String str3 = "abc" + str2;
        System.out.println(str1 == str3);


    }


}

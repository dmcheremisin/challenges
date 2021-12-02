package com.coding.challenges.codeSignal;

//You are given a string s. Your task is to count the number of ways of splitting s into three non-empty parts a, b and c (s = a + b + c) in such a way that a + b, b + c and c + a are all different strings.
//
//NOTE: + refers to string concatenation.
//
//Example
//
//For s = "xzxzx", the output should be solution(s) = 5.
//
//Consider all the ways to split s into three non-empty parts:
//
//If a = "x", b = "z" and c = "xzx", then all a + b = "xz", b + c = "zxzx" and c + a = xzxx are different.
//If a = "x", b = "zx" and c = "zx", then all a + b = "xzx", b + c = "zxzx" and c + a = zxx are different.
//If a = "x", b = "zxz" and c = "x", then all a + b = "xzxz", b + c = "zxzx" and c + a = xx are different.
//If a = "xz", b = "x" and c = "zx", then a + b = b + c = "xzx". Hence, this split is not counted.
//If a = "xz", b = "xz" and c = "x", then all a + b = "xzxz", b + c = "xzx" and c + a = xxz are different.
//If a = "xzx", b = "z" and c = "x", then all a + b = "xzxz", b + c = "zx" and c + a = xxzx are different.
//Since there are five valid ways to split s, the answer is 5.

import java.util.ArrayList;
import java.util.Comparator;

//Input:
//s: "xzxzx"
//Expected Output:
//5
//Input:
//s: "xzy"
//Expected Output:
//1
//Input:
//s: "xxx"
//Expected Output:
//0
public class SplitString {

    int solution(String s) {
        new ArrayList<Integer>().sort(Comparator.naturalOrder());
        int count = 0;
        int length = s.length();
        for(int i = 1; i < length - 1; i++) {
            String a = s.substring(0, i);
            //ystem.out.println("> a = " + a);
            for(int j = i + 1; j < length; j++) {
                String b = s.substring(i, j);
                //System.out.println(">> b = " + b);
                String c = s.substring(j, length);
                //System.out.println(">>> c = " + c);
                String f = a + b;
                String m = b + c;
                String l = c + a;
                if(!f.equals(m) && !f.equals(l) && !m.equals(l)) {
                    //System.out.println("+1");
                    count++;
                }
            }
        }
        return count;
    }

}

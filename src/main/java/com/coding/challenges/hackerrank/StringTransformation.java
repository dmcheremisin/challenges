package com.coding.challenges.hackerrank;

public class StringTransformation {

    public static String solution(String S) {
        StringBuilder sb;
        String newS = "E";
        while (!S.equals(newS)) {
            if (!newS.equals("E")) S = newS;
            sb = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if ((i + 1) < S.length() && isAB(c, S.charAt(i + 1))) {
                    i++;
                    continue;
                }
                if ((i + 1) < S.length() && isCD(c, S.charAt(i + 1))) {
                    i++;
                    continue;
                }
                sb.append(c);
            }
            newS = sb.toString();
        }

        return newS;
    }

    private static boolean isAB(char c1, char c2) {
        return (c1 == 'A' && c2 == 'B') || (c1 == 'B' && c2 == 'A');
    }

    private static boolean isCD(char c1, char c2) {
        return (c1 == 'C' && c2 == 'D') || (c1 == 'D' && c2 == 'C');
    }

    public static void main(String[] args) {
//        String s = solution("CBACD");
//        System.out.println(s);
//        String s = solution("CABABD");
//        System.out.println(s);
//        String s = solution("ACBDACBD");
//        System.out.println(s);
        String s = solution("CD");
        System.out.println(s);
    }
}
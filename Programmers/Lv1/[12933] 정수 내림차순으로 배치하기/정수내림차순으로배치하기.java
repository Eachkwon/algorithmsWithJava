package Programmers.Lv1;

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr);

        String str = new StringBuilder(String.valueOf(arr)).reverse().toString();

        return Long.parseLong(str);
    }
}

package Programmers.Lv0;

import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] n = new int[4];
        int[] m = new int[4];

        for(int i=0; i<4; i++){
            n[i] = dots[i][0];
            m[i] = dots[i][1];
        }

        Arrays.sort(n);
        Arrays.sort(m);

        return ((n[3]-n[0])*(m[3]-m[0]));
    }
}
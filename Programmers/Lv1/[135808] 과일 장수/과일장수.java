package Programmers.Lv1;

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        int[][] arr = new int[score.length/m][m];
        int count = score.length-1;
        for(int i=0; i<score.length/m; i++) {
            for(int j=0; j<m; j++) {
                arr[i][j] = score[count];
                count--;
            }
            answer += m*arr[i][m-1];
        }

        return answer;
    }
}
package Programmers.Lv1;

import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++) {
            int[] arr = new int[i+1];
            for(int j=0; j<i+1; j++) {
                arr[j] = score[j];
            }

            Arrays.sort(arr);
            if(i<k) {
                answer[i] = arr[0];
                continue;
            }

            answer[i] = arr[i-k+1];
        }

        return answer;
    }
}
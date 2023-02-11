package Programmers.Lv0;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] rank = new int[emergency.length];

        for(int i=0; i<emergency.length; i++) {
            rank[i] = emergency[i];
        }

        Arrays.sort(rank);

        int count = emergency.length;
        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<emergency.length; j++) {
                if(rank[i]==emergency[j]) {
                    answer[j] = count;
                    count--;
                }
            }
        }

        return answer;
    }
}

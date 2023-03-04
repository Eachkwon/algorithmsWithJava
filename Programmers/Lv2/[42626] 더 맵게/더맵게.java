package Programmers.Lv2;

import java.util.Arrays;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);

        if(scoville[0]>=K) return answer;

        for(int i=0; i<scoville.length-1; i++) {
            scoville[i] = scoville[i] + scoville[i+1]*2;
            scoville[i+1] = 0;
            answer++;

            Arrays.sort(scoville);
            if(scoville[i+1]>=K) return answer;
        }

        if(scoville[scoville.length-1]<K) return -1;

        return answer;
    }
}

/*
4.51ms
18.48ms
7.59ms
 */
package Programmers.Lv2;

import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] arr = new int[10000001];

        for(int i=0; i<tangerine.length; i++) {
            arr[tangerine[i]]++;
        }
        Arrays.sort(arr);

        int sum = 0;
        int idx = arr.length-1;
        while(true) {
            sum += arr[idx];
            idx--;
            answer++;
            if(sum>=k) break;
        }

        return answer;
    }
}

/*
32.91ms
34.14ms
39.21ms
 */

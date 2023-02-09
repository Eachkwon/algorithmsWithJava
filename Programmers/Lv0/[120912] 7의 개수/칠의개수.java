package Programmers.Lv0;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        char[] arr = Arrays.toString(array).replaceAll("[^0-9]","").toCharArray();
        for(char num: arr) {
            if(num-'0'==7) {
                answer++;
            }
        }
        return answer;
    }
}
package Programmers.Lv0;
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(array);

        for(int num: array){
            if(Math.abs(num-n)<min){
                min = Math.abs(num-n);
                answer = num;
            }
        }

        return answer;
    }
}

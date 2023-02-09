package Programmers.Lv0;
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        //int[]에 가장 긴 변이 있는 경우
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];
        for(int i=1; i<=max; i++) {
            if(max<min+i) {
                answer++;
            }
        }

        //나머지 한 변이 가장 긴 경우
        answer += (max-min) - (max+1);

        return answer;
    }
}

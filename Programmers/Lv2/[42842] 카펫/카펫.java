package Programmers.Lv2;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i=3; i<sum; i++) {
            int j = sum/i;

            if(j*i==sum&&(i-2)*(j-2)==yellow) {
                answer[0] = Math.max(i,j);
                answer[1] = Math.min(i,j);
                break;
            }
        }

        return answer;
    }
}
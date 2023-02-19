package Programmers.Lv0;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];

        for(int i=0; i< lines.length; i++) {
            for(int j=lines[i][0]; j<lines[i][1]; j++) {
                arr[j+100]++;
            }
        }

        for(int n : arr){
            if(n>1) {
                answer++;
            }
        }

        return answer;
    }
}
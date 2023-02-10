package Programmers.Lv0;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int l = i; l<=j; l++){
            char[] arr = Integer.toString(l).toCharArray();

            for(char num : arr){
                if(num-'0'==k) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
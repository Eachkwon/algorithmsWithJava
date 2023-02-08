package Programmers.Lv0;

class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] arr = String.valueOf(order).toCharArray();

        for(char num: arr){
            if(num-'0'==3||num-'0'==6||num-'0'==9){
                answer++;
            }
        }

        return answer;
    }
}
package Programmers.Lv2;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;

        for(int i=0; i<prices.length-1; i++) {
            int sec = 0;
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i]>prices[j]) {
                    sec++;
                    break;
                }
                sec++;
            }

            answer[i] = sec;
        }

        return answer;
    }
}
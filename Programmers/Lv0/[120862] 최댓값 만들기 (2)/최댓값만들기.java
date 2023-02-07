package Programmers.Lv0;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1000000000;

        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                if(i!=j&&numbers[i]*numbers[j]>answer) {
                    answer = numbers[i]*numbers[j];
                }
            }
        }

        return answer;
    }
}

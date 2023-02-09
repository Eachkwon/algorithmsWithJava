package Programmers.Lv0;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        int leng = numbers.length;

        for(int i=1; i<k; i++){
            answer += 2;

            if(answer>numbers[leng-1]){
                answer = answer-leng;
            }
        }
        return answer;
    }
}

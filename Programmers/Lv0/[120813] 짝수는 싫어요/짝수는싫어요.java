package Programmers.Lv0;

class Solution {
    public int[] solution(int n) {
        int leng = n/2;
        if(n%2!=0) {
            leng +=1;
        }

        int[] answer = new int[leng];
        int number = 1;
        for(int i=0; i<leng; i++) {
            answer[i] = number;
            number += 2;
        }

        return answer;
    }
}
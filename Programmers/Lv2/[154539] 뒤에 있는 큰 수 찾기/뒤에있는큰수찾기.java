package Programmers.Lv2;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        answer[numbers.length-1] = -1;

        for(int i=0; i<numbers.length-1; i++) {
            int max = -1;

            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i]<numbers[j]) {
                    max = numbers[j];
                    break;
                }
            }

            answer[i] = max;
        }

        return answer;
    }
}

/*
50.82ms
41.35ms
36.12ms
 */
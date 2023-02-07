package Programmers.Lv0;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int leng = numbers.length;
        int[] answer = new int[leng];

        if(direction.equals("left")) {
            for(int i=0; i<leng-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[leng-1] = numbers[0];
        } else {
            for(int i=0; i<leng-1; i++) {
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[leng-1];
        }

        return answer;
    }
}
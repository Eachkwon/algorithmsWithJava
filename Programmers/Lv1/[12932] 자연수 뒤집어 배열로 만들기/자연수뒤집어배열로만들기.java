package Programmers.Lv1;

class Solution {
    public int[] solution(long n) {
        int leng = Long.toString(n).length();
        int[] answer = new int[leng];
        for(int i=0; i<leng; i++){
            answer[i] = (int)(n%10);
            n /=10;
        }
        return answer;
    }
}
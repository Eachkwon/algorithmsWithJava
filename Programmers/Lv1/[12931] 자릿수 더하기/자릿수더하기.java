package Programmers.Lv1;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String leng = Integer.toString(n);
        for(int i=0; i<leng.length(); i++) {
            answer += n%10;
            n /=10;
        }
        return answer;
    }
}
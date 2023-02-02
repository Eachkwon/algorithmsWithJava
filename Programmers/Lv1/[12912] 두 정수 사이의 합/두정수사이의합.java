package Programmers.Lv1;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if(a==b){
            return a;
        } else if(a>b) {
            for(int i=b; i<=a; i++) {
                answer += i;
            }
        } else {
            for(int j=a; j<=b; j++) {
                answer += j;
            }
        }

        return answer;
    }
}

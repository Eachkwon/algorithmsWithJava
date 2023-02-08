package Programmers.Lv0;

class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;

        while(sum<=n){
            answer++;
            sum *= answer;
        }

        if(sum!=n) {
            answer -= 1;
        }

        return answer;
    }
}

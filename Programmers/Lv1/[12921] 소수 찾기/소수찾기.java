package Programmers.Lv1;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++){
            for(int j=2; j<=n; j++) {
                if(i%j==0&&i!=j){
                    break;
                } else if(i%j==0&&i==j) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

/*
6.12ms
31.14ms
59.78ms
 */
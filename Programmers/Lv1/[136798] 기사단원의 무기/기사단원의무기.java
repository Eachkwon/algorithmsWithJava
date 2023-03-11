package Programmers.Lv1;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number; i++) {
            int divisor = 0;
            int a = i;
            for(int j=1; j<=a; j++) {
                if(a%j==0) {
                    divisor++;
                }
            }

            if(divisor>limit) {
                answer += power;
            } else {
                answer += divisor;
            }
        }

        return answer;
    }
}

/*
133.84ms
150.43ms
159.49ms
 */
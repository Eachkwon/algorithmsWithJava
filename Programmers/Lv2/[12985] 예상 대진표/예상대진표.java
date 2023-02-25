package Programmers.Lv2;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while(a!=b) {
            a = a/2 + a%2;
            b = b/2 + b%2;
            answer++;
        }

        return answer;
    }
}

/*
a, b가 홀수일 때 if문을 통해 1을 더해줬더니 테스트 돌릴 때 시간초과가 났다.

if문을 빼고 2로 나눈 나머지를 더해줌으로써 해결하였다.
 */
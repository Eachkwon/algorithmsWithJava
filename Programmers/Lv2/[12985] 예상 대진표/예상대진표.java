package Programmers.Lv2;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;

        while(a+b!=3) {
            if(a%2!=0) a++;
            if(b%2!=0) b++;

            a /= 2;
            b /= 2;
            answer++;
        }

        return answer;
    }
}

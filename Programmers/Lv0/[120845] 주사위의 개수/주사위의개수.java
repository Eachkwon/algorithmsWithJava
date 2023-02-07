package Programmers.Lv0;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;

        for(int leng : box) {
            answer *= leng/n;
        }

        return answer;
    }
}

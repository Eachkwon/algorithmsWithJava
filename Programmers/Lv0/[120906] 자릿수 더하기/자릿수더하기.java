package Programmers.Lv0;

class Solution {
    public int solution(int n) {
        int leng = (int)(Math.log10(n)+1);
        int sum=0;
        for(int i=0; i<leng; i++) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}

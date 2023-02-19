package Programmers.Lv1;

class Solution {
    public int[] solution(int n, int m) {
        int a = 1;
        for(int i=1; i<=Math.min(n,m); i++) {
            if(n%i==0 && m%i==0) {
                a = i;
            }
        }

        return new int[] {a,n*m/a};
    }
}

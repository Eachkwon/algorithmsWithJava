package Programmers.Lv1;

class Solution {
    public String solution(String s) {
        int leng = s.length();
        if(leng%2==0) {
            return s.substring(leng/2-1, leng/2+1);
        }
        return s.substring(leng/2, leng/2+1);
    }
}

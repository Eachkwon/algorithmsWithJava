package Programmers.Lv0;

class Solution {
    public int solution(int n, int k) {
        int food = n*12000;
        int beverage = k*2000;
        int service = n/10;
        return food + beverage - service*2000;
    }
}

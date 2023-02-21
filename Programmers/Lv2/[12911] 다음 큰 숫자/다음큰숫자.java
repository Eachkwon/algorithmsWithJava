package Programmers.Lv2;

class Solution {
    public int solution(int n) {
        int a = countOne(Integer.toBinaryString(n));
        int m = n+1;
        int b = countOne(Integer.toBinaryString(m));

        while(a!=b) {
            m++;
            b = countOne(Integer.toBinaryString(m));
        }
        return m;
    }

    public int countOne(String str) {
        int count = 0;
        for(char ch : str.toCharArray()) {
            if(ch=='1') {
                count++;
            }
        }
        return count;
    }
}}

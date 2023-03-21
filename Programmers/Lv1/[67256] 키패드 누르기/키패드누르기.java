package Programmers.Lv1;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuffer sb = new StringBuffer();
        int left = 10, right = 12;

        for(int i=0; i<numbers.length; i++) {
            int n = numbers[i];

            if(n==1||n==4||n==7) {
                sb.append("L");
                left = n;
            } else if(n==3||n==6||n==9) {
                sb.append("R");
                right = n;
            } else {
                if(n==0) n = 11;
                int l = Math.abs(n-left)/3+Math.abs(n-left)%3;
                int r = Math.abs(n-right)/3+Math.abs(n-right)%3;

                if(l==r&&hand.equals("left")) {
                    sb.append("L");
                    left = n;
                } else if(l==r&&hand.equals("right")) {
                    sb.append("R");
                    right = n;
                } else if(l>r) {
                    sb.append("R");
                    right = n;
                } else {
                    sb.append("L");
                    left = n;
                }
            }
        }

        return sb.toString();
    }
}
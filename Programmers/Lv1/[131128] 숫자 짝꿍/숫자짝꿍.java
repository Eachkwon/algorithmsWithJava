package Programmers.Lv1;

class Solution {
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for(char x : X.toCharArray()) {
            xArr[x-'0']++;
        }
        for(char y : Y.toCharArray()) {
            yArr[y-'0']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<xArr.length; i++) {
            while(xArr[i]>0&&yArr[i]>0) {
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }

        if(sb.toString().equals("")) { return "-1"; }
        if(sb.reverse().toString().substring(0,1).equals("0")) { return "0"; }

        return sb.toString();
    }
}
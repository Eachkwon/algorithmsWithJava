package Programmers.Lv1;

class Solution {
    public int solution(String dartResult) {
        int[] arr = new int[3];
        String numstr = "";
        int num = 0, idx = 0;

        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if(c>='0'&&c<='9') {
                numstr += String.valueOf(c);
            } else if(c=='S') {
                num = Integer.valueOf(numstr);
                numstr = "";
                arr[idx] = num;
                idx++;
            } else if(c=='D') {
                num = Integer.valueOf(numstr);
                numstr = "";
                arr[idx] = num*num;
                idx++;
            } else if(c=='T') {
                num = Integer.valueOf(numstr);
                numstr = "";
                arr[idx] = num*num*num;
                idx++;
            } else if(c=='*') {
                if(idx==1) {
                    arr[0] *= 2;
                } else {
                    arr[idx-1] *= 2;
                    arr[idx-2] *= 2;
                }
            } else if(c=='#') {
                arr[idx-1] *= -1;
            }

        }

        return arr[0]+arr[1]+arr[2];
    }
}

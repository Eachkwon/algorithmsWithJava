package Programmers.Lv2;

class Solution {
    public String solution(int n) {
        int[] arr = new int[n+1];
        int cnt = 1;
        int a = 1;

        while(arr[n]==0) {
            String str = Integer.toString(a).replace("1","");
            str = str.replace("2","");
            str = str.replace("4","");
            if(str.equals("")) {
                arr[cnt] = a;
                cnt++;
                a++;
            } else {
                a++;
            }
        }

        return Integer.toString(arr[n]);
    }
}

/*
14.43ms
609.87ms
396.27ms
 */
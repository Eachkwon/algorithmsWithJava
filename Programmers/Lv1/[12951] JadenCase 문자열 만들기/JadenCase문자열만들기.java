package Programmers.Lv1;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0].substring(0,1).toUpperCase());
        sb.append(arr[0].substring(1));

        for(int i=1; i<arr.length; i++) {
            sb.append(" ").append(arr[i].substring(0,1).toUpperCase());
            sb.append(arr[i].substring(1));
        }

        return sb.toString();
    }
}

/*
12.01ms → 0.15ms
8.50ms → 0.15ms
11.87ms → 0.18ms
 */

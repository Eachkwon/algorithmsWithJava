package Programmers.Lv1;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        String answer = arr[0].substring(0,1).toUpperCase() + arr[0].substring(1);

        for(int i=1; i<arr.length; i++) {
            answer += " "+arr[i].substring(0,1).toUpperCase();
            answer +=  arr[i].substring(1);
        }

        return answer;
    }
}

/*
12.01
8.50
11.87
 */

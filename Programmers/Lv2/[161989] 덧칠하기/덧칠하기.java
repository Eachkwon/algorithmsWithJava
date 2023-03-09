package Programmers.Lv2;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        boolean[] arr = new boolean[n];
        for(int i=0; i<section.length; i++) {
            arr[section[i]-1] = true;
        }

        for(int i=section[0]-1; i<arr.length; i++) {
            if(arr[i]) {
                i +=m-1;
                answer++;
            }
        }

        return answer;
    }
}

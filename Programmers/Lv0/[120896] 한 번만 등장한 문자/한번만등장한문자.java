package Programmers.Lv0;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        char[] charArr = s.toCharArray();

        for(char apb: charArr){
            arr[apb-97]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                answer += (char)(97+i);
            }
        }

        return answer;
    }
}
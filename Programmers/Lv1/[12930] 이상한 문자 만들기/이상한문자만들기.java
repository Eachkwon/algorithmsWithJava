package Programmers.Lv1;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(String.valueOf(arr[i]).equals(" ")) {
                answer += " ";
                count = 0;
            } else if(count%2==0){
                answer += String.valueOf(arr[i]).toUpperCase();
                count++;
            } else {
                answer += String.valueOf(arr[i]).toLowerCase();
                count++;
            }
        }
        return answer;
    }
}

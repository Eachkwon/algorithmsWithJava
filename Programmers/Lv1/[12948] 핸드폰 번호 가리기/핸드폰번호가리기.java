package Programmers.Lv1;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int leng = phone_number.length();

        for(int i=0; i<leng-4; i++) {
            answer += "*";
        }

        return answer+phone_number.substring(leng-4);
    }
}

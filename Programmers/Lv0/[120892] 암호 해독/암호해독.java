package Programmers.Lv0;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int count = code-1;

        for(int i=0; i<cipher.length()/code; i++) {
            answer += cipher.charAt(count);
            count += code;
        }
        return answer;
    }
}

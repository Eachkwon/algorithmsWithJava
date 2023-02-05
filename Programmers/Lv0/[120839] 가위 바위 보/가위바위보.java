package Programmers.Lv0;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] arr = rsp.toCharArray();

        for(char alphabet: arr) {
            if(alphabet-'0' ==5) {
                answer += 2;
            } else if(alphabet-'0' == 2) {
                answer += 0;
            } else {
                answer += 5;
            }
        }

        return answer;
    }
}

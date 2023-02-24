package Programmers.Lv1;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char val = s.charAt(0);
        int a = 1, b = 0;

        for(int i=1; i<s.length(); i++) {
            if(val==s.charAt(i)) {
                a++;
            } else {
                b++;
            }

            if(i<s.length()-1&&a==b) {
                answer++;
                val = s.charAt(i+1);
                i++;
                a = 1;
                b = 0;
            }
        }

        if(val!=' ') {
            answer++;
        }

        return answer;
    }
}
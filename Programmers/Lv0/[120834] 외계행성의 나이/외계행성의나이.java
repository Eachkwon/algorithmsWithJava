package Programmers.Lv0;

class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        for(int i=0; i<str.length(); i++) {
            answer+= (char)(str.charAt(i)+49);
        }

        return answer;
    }
}

/*
아스키코드
48~57: 0-9
65~90: A-Z
97~122: a-z
 */

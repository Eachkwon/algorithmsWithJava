package Programmers.Lv0;

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        String answer = "";
        for(char alphabet: arr) {
            if(Character.isUpperCase(alphabet)) {
                answer += Character.toLowerCase(alphabet);
            } else {
                answer += Character.toUpperCase(alphabet);
            }
        }

        return answer;
    }
}

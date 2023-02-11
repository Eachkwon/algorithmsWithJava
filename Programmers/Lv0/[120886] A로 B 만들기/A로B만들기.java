package Programmers.Lv0;

class Solution {
    public String solution(String letter) {
        String[] morseArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] morse = letter.split(" ");

        String answer = "";
        for(String code: morse) {
            for(int i=0; i<morseArr.length; i++) {
                if(code.equals(morseArr[i])) {
                    answer += (char)(i+97);
                }
            }
        }

        return answer;
    }
}

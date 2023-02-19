package Programmers.Lv2;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int num;

        while(!s.equals("1")){
            num = 0;
            for(char ch : s.toCharArray()) {
                if(ch=='0') {
                    num++;
                }
            }
            answer[1] += num;
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;
    }
}

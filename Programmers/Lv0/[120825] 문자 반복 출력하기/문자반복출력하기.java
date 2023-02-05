package Programmers.Lv1;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        int count = 0;

        for(int i=0; i<my_string.length(); i++) {
            for(int j=0; j<n; j++) {
                answer += arr[count];
            }
            count++;
        }
        return answer;
    }
}

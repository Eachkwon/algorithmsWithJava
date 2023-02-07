package Programmers.Lv0;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String num = my_string.replaceAll("[^0-9]","");

        char[] arr = num.toCharArray();
        Arrays.sort(arr);

        int[] answer = new int[num.length()];
        for(int i=0; i<num.length(); i++) {
            answer[i] = arr[i] - '0';
        }

        return answer;
    }
}
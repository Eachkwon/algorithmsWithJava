package Programmers.Lv1;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;

        for(int[] command : commands) {
            int[] arr = new int[command[1]-command[0]+1];

            for(int i=0; i<arr.length; i++) {
                arr[i] = array[command[0]+i-1];
            }
            Arrays.sort(arr);

            answer[count] = arr[command[2]-1];
            count++;
        }

        return answer;
    }
}
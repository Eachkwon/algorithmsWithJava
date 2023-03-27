package Programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] elements) {
        ArrayList<Integer> arr = new ArrayList<>();

        int[] element = new int[elements.length*2];
        for(int i=0; i<elements.length; i++) {
            element[i] = elements[i];
            element[elements.length+i] = elements[i];
        }

        for(int i=1; i<=elements.length; i++) {
            int sum = 0;
            for(int j=i-1; j<i+elements.length-1; j++) {
                sum += element[j];
                arr.add(sum);
            }
        }

        return arr.stream().distinct().mapToInt(i->i).toArray().length;
    }
}
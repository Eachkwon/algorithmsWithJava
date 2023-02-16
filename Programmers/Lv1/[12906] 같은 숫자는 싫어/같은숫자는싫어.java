package Programmers.Lv1;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> array = new ArrayList<>();

        int value = -1;
        for(int i : arr){
            if(i!= value) {
                array.add(i);
                value = i;
            }
        }

        return array.stream().mapToInt(i->i).toArray();
    }
}
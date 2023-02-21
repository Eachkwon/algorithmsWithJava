package Programmers.Lv0;

import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(numlist);

        for(int num : numlist) {
            arr.add(num);
        }

        Collections.reverse(arr);
        arr.sort((s1,s2) -> Integer.compare(Math.abs(s1-n),Math.abs(s2-n)));

        return arr.stream().mapToInt(i->i).toArray();
    }
}

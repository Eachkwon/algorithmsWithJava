package Programmers.Lv0;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();

        int idx = 2;
        while(n>1) {
            if(n%idx==0) {
                if(!arr.contains(idx)) {
                    arr.add(idx);
                } else {
                    n /= idx;
                }
            } else {
                idx++;
            }
        }

        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

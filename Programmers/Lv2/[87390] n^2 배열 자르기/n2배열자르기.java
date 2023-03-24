package Programmers.Lv2;

import java.util.ArrayList;

class Solution {
    public long[] solution(int n, long left, long right) {
        ArrayList<Long> arr = new ArrayList<>();

        for(long i=left; i<=right; i++) {
            arr.add(Math.max(i/n,i%n)+1);
        }

        return arr.stream().mapToLong(l->l).toArray();
    }
}
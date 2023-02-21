package Programmers.Lv2;

import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        List<Integer> arr = new ArrayList<>();
        for(int a : A) {
            arr.add(a);
        }
        Collections.reverse(arr);
        int[] a = arr.stream().mapToInt(i->i).toArray();

        for(int i=0; i<A.length; i++){
            answer += B[i]*a[i];
        }

        return answer;
    }
}
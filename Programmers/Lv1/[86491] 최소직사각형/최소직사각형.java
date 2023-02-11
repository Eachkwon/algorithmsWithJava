package Programmers.Lv1;

import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        for(int[] card : sizes){
            Arrays.sort(card);
        }

        int m = 0;
        int n = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>m) {
                m = sizes[i][0];
            }

            if(sizes[i][1]>n) {
                n = sizes[i][1];
            }
        }

        return m*n;
    }
}

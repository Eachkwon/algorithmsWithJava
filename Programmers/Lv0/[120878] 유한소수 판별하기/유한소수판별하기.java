package Programmers.Lv0;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int a, int b) {
        int answer = 2;

        int idx = 2;
        while(idx<=a) {
            if(a%idx==0&&b%idx==0) {
                a /= idx;
                b /= idx;
            } else {
                idx++;
            }
        }

        if(a%b==0) {
            return 1;
        }

        idx = 2;
        List<Integer> arr1 = new ArrayList<>();
        while(idx<=b) {
            if(b%idx==0) {
                if(!arr1.contains(idx)){
                    arr1.add(idx);
                }
                b/= idx;
            } else {
                idx++;
            }
        }

        int[] arr2 = arr1.stream().mapToInt(Integer::intValue).toArray();
        if(arr2.length==2&&arr2[0]*arr2[1]==10) {
            answer = 1;
        } else if(arr2.length==1&&arr2[0]==2||arr2.length==1&&arr2[0]==5) {
            answer = 1;
        }

        return answer;
    }
}

/*
2.52
2.07
2.20
 */
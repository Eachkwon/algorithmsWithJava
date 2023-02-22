package Programmers.Lv1;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    arr.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        for(Integer n: arr) {
            boolean prime = true;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i==0) {
                    prime = false;
                    break;
                }
            }

            if(prime) answer++;
        }

        return answer;
    }
}
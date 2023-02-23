package Programmers.Lv1;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(!arr.contains(nums[i])) arr.add(nums[i]);
        }

        if(arr.size()>=nums.length/2) { return nums.length/2; }

        return arr.size();
    }
}

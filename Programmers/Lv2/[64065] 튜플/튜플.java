package Programmers.Lv2;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2,s.length()-2);
        String[] arr = s.split("\\},\\{");

        HashMap<Integer,Integer> map = new HashMap<>();
        for(String str : arr) {
            String[] nums = str.split(",");
            for(String num: nums) {
                int n = Integer.parseInt(num);
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }

        int idx = arr.length;
        int[] answer = new int[idx];
        for(int i=0; i<arr.length; i++) {
            for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
                if(entry.getValue()==idx) {
                    answer[i] = entry.getKey();
                    idx--;
                    break;
                }
            }
        }

        return answer;
    }
}

/*
String을 다듬어 각 원소(Key)가 나올 때 마다 Value에 1씩 더하는 것 까지는 문제 없었는데
Value 값으로 Key 값 찾는 부분에서 아직 서투르다고 느꼈다. HashMap 다시 공부하자.
 */
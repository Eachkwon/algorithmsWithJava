package Programmers.Lv2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<phone_book.length; i++) {
            map.put(phone_book[i],0);
        }

        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            for(int i=0; i<phone_book.length; i++) {
                if(phone_book[i].startsWith(entry.getKey()))
                    map.put(entry.getKey(),entry.getValue()+1);
            }

            if(entry.getValue()>=2) return false;
        }

        return answer;
    }
}

/*
97.71ms
10.54ms
115.57ms
 */
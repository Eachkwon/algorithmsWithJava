package Programmers.Lv2;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<phone_book.length; i++) {
            map.put(phone_book[i],i);
        }

        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            for(int i=0; i<phone_book.length; i++) {
                if(entry.getValue()!=i&&phone_book[i].startsWith(entry.getKey()))
                    return false;
            }
        }

        return answer;
    }
}

/*
97.71ms → 61.70ms
10.54ms → 18.42ms
115.57ms → 92.40ms

1. 같은 접두어를 가질 경우 value 값에 1씩 더해주고, for문을 돌린 뒤 value가 2 이상일 때 false를 return하였다.
2. value에 idx를 넣고, 접두어가 일치하고 phone_book[i]!=idx일 때 false를 return함으로써 if문 하나를 줄였다.
 */
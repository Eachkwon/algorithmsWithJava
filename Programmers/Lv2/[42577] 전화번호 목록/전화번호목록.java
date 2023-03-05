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
            for(int i=entry.getValue()+1; i<phone_book.length; i++) {
                if(phone_book[i].startsWith(entry.getKey()))
                    return false;
            }
        }

        return answer;
    }
}

/*
97.71ms → 61.70ms → 48.38ms
10.54ms → 18.42ms → 7.62ms
115.57ms → 92.40ms → 47.53ms

1. 같은 접두어를 가질 경우 value 값에 1씩 더해주고, for문을 돌린 뒤 value가 2 이상일 때 false를 return하였다.
2. value에 idx를 넣고, 접두어가 일치하고 phone_book[i]!=idx일 때 false를 return함으로써 if문 하나를 줄였다.
3. Arrays.sort()를 통해 배열을 오름차순으로 정렬했기 때문에 phone_book[i] 탐색 시 인덱스 i(자기 번호)이하의 배열과의 비교를 없앴다.
   arr = ["113","119","1195524421","97674223"]
   arr[1]의 번호를 접두어로 가진 전화번호 탐색 시 arr[0]과의 비교 필요X
 */
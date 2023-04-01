package Programmers.Lv2;

import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String,Integer> map = new HashMap<>();

        // records 해체해서 HashMap에 차량번호, 시간 저장하기
        for(int i=0; i<records.length; i++) {
            String hour = records[i].split(" ")[0];
            int time = Integer.valueOf(hour.split(":")[0])*60+Integer.valueOf(hour.split(":")[1]);
            String car = records[i].split(" ")[1];

            switch(records[i].split(" ")[2]) {
                case "IN" : map.put(car,map.getOrDefault(car,0)-time);
                    break;
                case "OUT" : map.put(car,map.getOrDefault(car,0)+time);
                    break;
            }
        }

        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            // 12시 자정에 입차하거나 11시 59분까지 출차하지 않은 차들 처리
            if(entry.getValue()<=0) map.put(entry.getKey(),entry.getValue()+(24*60-1));

            // 주차요금 계산
            if(entry.getValue()<=fees[0]) {
                map.put(entry.getKey(),fees[1]);
            } else {
                int remainder = (entry.getValue()-fees[0])/fees[2];
                if((entry.getValue()-fees[0])%fees[2]!=0) remainder++;

                map.put(entry.getKey(),fees[1]+remainder*fees[3]);
            }
        }

        // Hashmap 차량번호가 작은 자동차 순서대로 정리
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((s1, s2) -> s1.compareTo(s2));

        // ArrayList에 주차요금 입력
        List<Integer> answer = new ArrayList<>();
        for(String str : list) {
            answer.add(map.get(str));
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
package Programmers.Lv1;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        String[] arr = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            String str = arr[i].split(" ")[1];
            map.put(str,map.getOrDefault(str,0)+1);
        }

        ArrayList<String> suspended = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            if(entry.getValue()>=k) suspended.add(entry.getKey());
        }

        for(int i=0; i<id_list.length; i++) {
            for(int j=0; j<arr.length; j++) {
                String[] r = arr[j].split(" ");
                if(suspended.contains(r[1])&&r[0].equals(id_list[i]))
                    answer[i]++;
            }
        }

        return answer;
    }
}

/*
37.28ms
77.26ms
88.63ms

배열 중복 값 제거하기
1. HashSet
HashSet은 순서가 없는 Collection이기 때문에 다시 배열로 변환했을 때 원래 배열의 순서를 보장하지 않는다.
배열의 순서를 유지해야 한다면 LinkedHashSet 클래스를 사용해야 한다.
String[] arr = {"H","E","L","L","O"};
HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
String[] result = hashSet.toArray(new String[0]);

2. LinkedHashSet
String[] arr = {"H","E","L","L","O"};
LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
String[] result = linkedHashSet.toArray(new String[0]);

3. Stream / distinct()
String[] arr = {"H","E","L","L","O"};
String[] result = Arrays.stream(arr).distinct().toArray(String[]::new);
 */
package Programmers.Lv2;

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0; i<record.length; i++) {
            String[] arr = record[i].split(" ");
            if(arr.length==2) continue;
            map.put(arr[1],arr[2]);
        }

        ArrayList<String> answer = new ArrayList<>();
        for(String str : record) {
            String[] arr = str.split(" ");

            if(arr[0].equals("Enter")) {
                answer.add(map.get(arr[1])+"님이 들어왔습니다.");
            } else if(arr[0].equals("Leave")) {
                answer.add(map.get(arr[1])+"님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[answer.size()]);
    }
}
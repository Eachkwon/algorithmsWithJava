package Programmers.Lv1;

import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        int year = Integer.valueOf(today.substring(0,4))*12*28;
        int month = Integer.valueOf(today.substring(5,7))*28;
        int day = Integer.valueOf(today.substring(8,10));
        int t = year+month+day;

        for(int i=0; i<privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            year = Integer.valueOf(arr[0].substring(0,4))*12*28;
            month = Integer.valueOf(arr[0].substring(5,7))*28;
            day = Integer.valueOf(arr[0].substring(8,10));
            int due = year + month + day-1;

            for(String term : terms) {
                if(term.contains(arr[1])) {
                    String m = term.split(" ")[1];
                    due += Integer.valueOf(m)*28;
                }
            }

            if(t>due) answer.add(i+1);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
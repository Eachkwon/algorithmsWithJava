package Programmers.Lv2;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        int day = 0;

        for(int i=0; i<progresses.length; i++) {
            while(progresses[i]+speeds[i]*day<100) {
                day++;
            }
            days[i] = day;
            day = 0;
        }

        int works = 1;
        int value = days[0];
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=1; i<days.length; i++) {
            if(days[i]<=value) {
                works++;
            } else {
                answer.add(works);
                works = 1;
                value = days[i];
            }
        }
        answer.add(works);

        return answer.stream().mapToInt(i->i).toArray();
    }
}

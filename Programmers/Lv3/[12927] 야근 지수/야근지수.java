package Programmers.Lv3;

import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works) {
            pq.add(work);
        }

        while(n!=0) {
            if(pq.size()==0) return answer;
            int max = pq.poll();
            n--;

            if(max==1) continue;

            pq.add(max-1);
        }

        while(!pq.isEmpty()) {
            int num = pq.poll();
            answer += num*num;
        }

        return answer;
    }
}
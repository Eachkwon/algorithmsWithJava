package Programmers.Lv3;

import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        for(String operation: operations) {
            if(operation.indexOf("I")==0) {
                int n = Integer.valueOf(operation.split(" ")[1]);
                minpq.offer(n);
                maxpq.offer(n);
            } else if(operation.equals("D 1")) {
                if(minpq.isEmpty()) continue;

                int n = maxpq.poll();
                minpq.remove(n);
            } else {
                if(minpq.isEmpty()) continue;

                int n = minpq.poll();
                maxpq.remove(n);
            }
        }

        if(minpq.isEmpty()) return new int[] {0,0};

        return new int[] {maxpq.peek(),minpq.peek()};
    }
}
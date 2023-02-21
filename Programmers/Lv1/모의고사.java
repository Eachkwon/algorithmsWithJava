package Programmers.Lv1;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int a = 0, b = 0, c = 0;

        for(int i=0; i<answers.length; i++){
            if(one[i%one.length]==answers[i]) { a++; }
            if(two[i%two.length]==answers[i]) { b++; }
            if(three[i%three.length]==answers[i]) { c++; }
        }

        int max = Math.max(Math.max(a, b),c);
        List<Integer> answer = new ArrayList<>();
        if(a==max) {answer.add(1);}
        if(b==max) {answer.add(2);}
        if(c==max) {answer.add(3);}

        return answer.stream().mapToInt(i->i).toArray();
    }
}
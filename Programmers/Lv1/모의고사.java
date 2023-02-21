package Programmers.Lv1;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5,2,1};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] arr = new int[3];

        int a = 0, b = 0, c = 0;

        for(int i=0; i<answers.length; i++){

            if(answers[i]==one[a]&&a==one.length-1) {
                a = 0;
                arr[0]++;
            } else if (a==one.length-1) {
                a = 0;
            } else if(answers[i]==one[a]) {
                arr[0]++;
                a++;
            } else {
                a++;
            }

            if(answers[i]==one[b]&&b==two.length-1) {
                b = 0;
                arr[1]++;
            } else if (b==two.length-1) {
                b = 0;
            } else if(answers[i]==two[b]) {
                arr[1]++;
                b++;
            } else {
                b++;
            }

            if(answers[i]==three[c]&&c==three.length-1) {
                c = 0;
                arr[2]++;
            } else if (c==three.length-1) {
                c = 0;
            } else if(answers[i]==three[c]) {
                arr[2]++;
                c++;
            } else {
                c++;
            }
        }

        int max = 0;
        for(int n: arr){
            if(max<n) {
                max = n;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(max==arr[i]) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}

/*
2.11ms
2.16ms
2.40ms
 */
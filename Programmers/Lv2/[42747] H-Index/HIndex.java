package Programmers.Lv2;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++) {
            int h = citations.length-i;
            if(h<=citations[i]) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}

/*
h번 이상 인용된 논문이 h편 이상일 때 h의 최댓값
[0, 1, 3, 5, 6]

0번 이상 인용된 논문은 5편
1번 이상 인용된 논문은 4편
3번 이상 인용된 논문은 3편
5번 이상 인용된 논문은 2편
6번 이상 인용된 논문은 1편

citations를 올림차순으로 했을 때 h의 값은 갈수록 작아지므로
처음 h가 일치했을 때 값을 return하면 된다.
 */
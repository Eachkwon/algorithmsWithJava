package Programmers.Lv1;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}

/*
여벌 체육복을 가져온 사람이 체육복을 도난당해도 굳이 자기 체육복을 안입는 편이 최댓값을 만들 수 있다고 생각해
그렇게 코드를 짜고 있었는데 제한사항 중에 여벌 체육복을 가져온 학생이 체육복을 도난당했을 경우 본인이 체육복을
입고 다른 학생에게는 빌려줄 수 없다는 내용이 있었다.

코드를 짜는 것도 중요하지만, 먼저 문제를 제대로 이해하자.
 */
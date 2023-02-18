package Programmers.Lv0;

class Solution {
    public int[] solution(int[][] score) {
        float[] arr = new float[score.length];
        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++) {
            arr[i] = (float)(score[i][0]+score[i][1])/2;
        }

        for(int i=0; i<score.length; i++) {
            answer[i] = 1;
            for(int j=0; j<score.length; j++) {
                if(arr[i]<arr[j]) {
                    answer[i] = answer[i] +1;
                }
            }
        }

        return answer;
    }
}

/*
테스트 3번, 7번이 실패가 떴는데 테스트 케이스를 살펴보니
평균점수의 소수점이 버려져 2.5 → 2로 저장되면서 발생한 문제였다.

int[]가 아닌 실수 데이터타입인 float[]을 사용하여 해결하였다.
 */
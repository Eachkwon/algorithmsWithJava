package Programmers.Lv2;

import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Arrays.sort(tangerine);
        int[] arr = new int[tangerine[tangerine.length-1]+1];

        for(int i=0; i<tangerine.length; i++) {
            arr[tangerine[i]]++;
        }
        Arrays.sort(arr);

        int sum = 0;
        int idx = arr.length-1;
        while(true) {
            sum += arr[idx];
            idx--;
            answer++;
            if(sum>=k) break;
        }

        return answer;
    }
}

/*
32.91ms → 0.35ms
34.14ms → 0.33ms
39.21ms → 0.43ms

1<= tangerine의 원소 <= 10,000,000
위의 제한사항을 참고하여 배열의 크기를 10,000,001로 설정했을 때 테스트 통과에는 아무 문제 없었지만
매번 저 크기의 배열을 사용하다 보니 메모리 사용에 아쉬운 점이 있었다.

Arrays.sort(tangerine);을 통해 가장 큰 귤의 크기만큼만 배열을 생성하여 문제를 해결하였다.

HashMap을 사용한 풀이가 많았는데 이 부분은 공부가 더 필요할 것 같다.
 */

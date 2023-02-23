package Programmers.Lv2;

class Solution {
    public int solution(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<n+1; i++) {
            arr[i] = (arr[i-1] + arr[i-2])%1234567;
        }

        return arr[n];
    }
}

/*
처음에는 arr[n]%1234567를 return하였는데 7번부터 오답이 났다.
피보나치 수의 경우 44번째만 가도 2,971,215,073으로 int의 범위를 넘어서버리기 때문에 발생한 문제였다.

각 연산을 수행할 때 마다 1234567로 나눈 나머지를 저장함으로써, 배열 안의 숫자를 int 범위 내에 있게 하여 해결하였다.
 */

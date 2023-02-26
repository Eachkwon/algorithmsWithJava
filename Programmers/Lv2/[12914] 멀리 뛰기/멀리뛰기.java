package Programmers.Lv2;

class Solution {
    public int solution(int n) {
        if(n<=3) {
            return n;
        }

        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<n+1; i++) {
            arr[i] = (arr[i-1] + arr[i-2])%1234567;
        }

        return arr[n];
    }
}

/*
피보나치 수와 같은 유형이라 문제가 어렵진 않았지만 1번만 런타임 에러가 발생해 살짝 애를 먹었다.

제한사항에서 n은 1 이상, 2000 이하인 정수이다.
n이 1일 경우,
int[] arr = new int[2];
arr[1] = 1;
arr[2] = 2; //인덱스 범위를 초과하며 ArrayIndexOutOfBoundsException이 발생하였다.

배열을 만들기 전, n이 3보다 작거나 같을 경우 n을 그대로 반환해주는 if문을 둠으로써 해결하였다.
 */
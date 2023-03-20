package Programmers.Lv1;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number; i++) {
            int divisor = 0;
            for(int j=1; j*j<=i; j++) {
                if(j*j==i) {
                    divisor++;
                } else if(i%j==0) {
                    divisor+= 2;
                }

                if(divisor>limit) break;
            }

            if(divisor>limit) {
                answer += power;
            } else {
                answer += divisor;
            }
        }

        return answer;
    }
}

/*
133.84ms → 6.12ms
150.43ms → 7.66ms
159.49ms → 15.40ms

1. for문으로 1~number까지 약수의 개수를 찾을 때 O(N²) = 100,000*100,000의 시간복잡도를 가진다.
2. for문으로 제곱근까지 약수의 개수를 찾을 때 O(제곱근(N)*N) = 316.22xxx*10만의 시간복잡도를 가지며 시간을 단축할 수 있다.
 */
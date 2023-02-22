package Programmers.Lv1;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++){
            boolean prime = true;
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j==0){
                    prime = false;
                    break;
                }
            }

            if(prime) { answer++; }
        }

        return answer;
    }
}

/*
6.12ms → 0.80ms
31.14ms → 1.49ms
59.78ms → 2.37ms
 */
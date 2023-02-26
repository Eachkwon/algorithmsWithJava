package Programmers.Lv2;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i=1; i<arr.length; i++) {
            int g = gcd(answer,arr[i]);
            answer = (answer*arr[i])/g;
        }

        return answer;
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
}

/*
유클리드 호제법
: 최대공약수를 구하는 방법 중 하나로 두 수를 나누어서 나온 나머지를 이전 나머지에 다시 나눈다.
  그렇게 해서 나머지가 0이 나올 때 직전 나머지가 최대공약수가 된다.

gcd(192,72)
1. 192 = 72*2 + 48
2. 72 = 48*1 + 24
3. 48 = 24*2 + 0 // 이전 몫인 24가 최대공약수

호제법 알고리즘으로 구현
private static int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
}
 */

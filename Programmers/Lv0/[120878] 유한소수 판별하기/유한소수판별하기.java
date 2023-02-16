package Programmers.Lv0;

class Solution {
    public int solution(int a, int b) {
        int idx = 2;
        while(idx<=a) {
            if(a%idx==0&&b%idx==0) {
                a /= idx;
                b /= idx;
            } else {
                idx++;
            }
        }

        while(b>1) {
            if(b%2==0) {
                b /= 2;
                continue;
            }
            if(b%5==0) {
                b /= 5;
                continue;
            }
            return 2;
        }

        return 1;
    }
}

/*
기약분수로 나타낸 후 분모의 소인수를 확인할 때 List에서 반복문으로 변경
2.52ms → 0.03ms
2.07ms → 0.02ms
2.20ms → 0.01ms
 */
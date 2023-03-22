package Programmers.Lv1;

import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int n: ingredient) {
            stack.push(n);
            int size = stack.size();

            if(size>=4) {
                if(  stack.get(size-4)==1
                        && stack.get(size-3)==2
                        && stack.get(size-2)==3
                        && stack.get(size-1)==1) {
                    answer++;
                    stack.pop(); stack.pop(); stack.pop(); stack.pop();
                }
            }
        }

        return answer;
    }
}

/*
5760.25ms → 48.69ms
7201.77ms → 44.42ms
5837.08ms → 40.97ms

1. String으로 변환해 1231(햄버거 순서)이 없어질 때 까지 반복하는 코드로 구현하였다. 테스트 5, 12에서 시간초과가 발생했다.
2. ingredient의 숫자를 Stack에 하나씩 담아 Stack 사이즈가 4이상이고 마지막 네자리 숫자가 1231일 때 4개를 꺼내는 코드를 구현하였다.
 */
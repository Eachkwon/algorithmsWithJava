package Programmers.Lv2;

import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Boolean> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                stack.push(true);
            } else if(s.charAt(i)==')') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}

/*
Stack의 특징
1. 먼저 들어간 자료가 나중에 나오는 LIFO(Last In First Out) 구조
2. 인터럽트 처리, 수식의 계산, 서브루틴의 복귀 번지 저장 등에 쓰인다.
3. 그래프의 깊이 우선 탐색(DFS)에서 사용된다.
4. 재귀적 함수를 호출할 때 사용한다.

Stack 사용법
1. 선언
Stack<Integer> stack = new Stack<>();
2. 값 추가
stack.push(1);
stack.push(2);
stack.push(3);
3. 값 삭제
stack.pop(); // 3 제거
stack.pop(); // 2 제거
stack.clear(); // stack 전체 값 제거(초기화)
4. Stack 가장 상단의 값 출력
stack.peek(); // 가장 마지막에 들어간 값 출력
5. 기타 메서드
stack.size();
stack.isEmpty(); // 비어있으면 true, 아니면 false return
stack.contains(1);
 */
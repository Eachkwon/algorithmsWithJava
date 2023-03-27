package Programmers.Lv2;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int s: scoville) {
            que.add(s);
        }

        while(que.peek()<K) {
            if(que.size()==1) return -1;

            que.add(que.poll()+que.poll()*2);
            answer++;
        }

        return answer;
    }
}

/*
4.51ms → 1.22ms
18.48ms → 2.34ms
7.59ms → 1.77ms

1. 배열의 오름차순 정렬을 이용하여 문제를 풀었다. 정확성에서는 문제 없었지만 효율성 테스트에서 통과하지 못했다.
2. 우선순위 큐를 이용하여 가장 낮은 숫자 2개를 섞어 다시 넣어주고 큐의 사이즈가 1일 경우 -1을 반환하도록 했다.
   속도 개선과 더불어 이전 코드보다 가독성도 좋아졌다.

Priority Queue(우선순위 큐) 특징
1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조(큐에 들어가는 원소는 비교가 가능한 기준이 있어야 함)
2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있음
3. 내부 구조가 힙으로 구성되어 있기 때문에 시간복잡도는 O(NLogN)
4. 우선순위를 중요시해야 하는 상황에서 쓰임

Priority Queue 사용법
1. 선언
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 우선순위가 낮은 숫자 순
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 높은 숫자 순
2. 값 추가
priorityQueue.add(1);
priorityQueue.add(2);
priorityQueue.offer(3);
3. 값 삭제
priorityQueue.poll(); // 첫 번째 값을 반환하고 제거, 비어있다면 null
priorityQueue.remove(); // 첫 번째 값 제거
priorityQueue.remove(int n); // n이 있을 경우 제거
priorityQueue.clear(); // 초기화
4. 기타 메서드
priorityQueue.peek(); // 첫 번째 값 참조
priorityQueue.size(); // 크기 반환
priorityQueue.toArray(); // 큐의 모든 요소를 포함하는 배열을 반환
 */
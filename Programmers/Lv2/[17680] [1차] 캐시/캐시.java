package Programmers.Lv2;

import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0) return cities.length*5;

        LinkedList<String> list = new LinkedList<>();
        int answer = 0;
        int hit = 1, miss = 5;

        for(int i=0; i<cities.length; i++) {
            String str = cities[i].toUpperCase();
            if(list.remove(str)) {
                answer += hit;
                list.add(str);
            } else {
                answer += miss;
                list.add(str);
                if(list.size()>cacheSize) list.remove(); // remove()는 헤드를 제거한다!
            }
        }

        return answer;
    }
}

/*
페이지 교체 알고리즘**
: 페이징 기법으로, 메모리를 관리하는 운영체제에서 페이지 부재가 발생하여 새로운
  페이지를 할당하기 위해 현재 할당된 페이지 중 어느 것과 교체할지를 결정하는 방법
  FIFO, LFU, LRU, OPT 등의 종류가 있음

FIFO(First-In First-Out)
1. 메모리에 가장 먼저 올라온 페이지를 교체하는 알고리즘
2. 단점: 중요한 페이지가 오래 있었다는 이유만으로 교체되는 불합리

LFU(Least Frequently Used)
1. 참조된 횟수가 가장 적은 페이지를 교체하는 알고리즘
2. 페이지가 참조될 때 마다 참조 횟수를 증가시켜 참조 횟수가 가장 적은 페이지를 교체
3. 단점
   - 가장 최근에 메모리로 옮겨진 페이지가 교체될 가능성이 높음
   - 초기에 많이 사용된 후 더 이상 사용되지 않는 페이지는 교체 가능성이 낮음
   - 높은 오버헤드

LRU(Least Recently Used)
1. 최근에 사용하지 않은 페이지를 가장 먼저 내보내는 알고리즘
2. 참조시간 또는 List를 이용하여 구현
   - 참조시간 이용 시: 페이지가 참조될 때 마다 그 때의 시간을 기록하여 참조시간이 가장 오래된 페이지를 교체
   - List 이용 시: 페이지가 참조되면 List의 선두로 옮겨 List의 가장 끝에 있는 페이지를 교체
3. 단점: 높은 오버헤드

OPT(Optimal Page Replacement)
1. 앞으로 가장 오랫동안 사용되지 않을 페이지를 교체하는 알고리즘
2. '프로세스가 앞으로 사용할 페이지를 미리 알아야 한다'는 전제조건이 선행되어야 함
3. 실제로 알 방법이 없기 때문에 구현이 불가능한 알고리즘, 다른 알고리즘과 비교 연구 목적을 위해 주로 사용


LinkedList(연결 리스트)**
- 각 노드가 데이터와 포인트를 가지고 한 줄로 연결되어 있는 방식의 자료구조
- 데이터의 추가나 삭제가 용이한 반면, 탐색 속도가 떨어짐

1. LinkedList 선언
LinkedList<Integer> list = new LinkedList<>();
2. 값 추가
list.addFirst(1); // 가장 앞에 데이터 추가
list.addLast(2); // 가장 뒤에 데이터 추가
list.add(3); // 데이터 추가, index 생략할 경우 마지막에 데이터 추가
list.add(3,4); // index 3에 데이터 4 추가
3. 값 삭제
list.removeFirst(); // 가장 앞의 데이터 제거
list.removeLast(); // 가장 뒤의 데이터 제거
list.remove(); // 생략 시 head 제거
list.remove(1); // index 1 제거
list.remove(Object object); // 해당 값이 없다면 false, 있다면 지우고 true 반환
list.clear(); // 모든 값 제거
4. 크기 구하기
list.size();
5. 값 출력
: 메서드 내부 동작은 순차 탐색으로 이루어져 있어 O(n)의 시간복잡도를 가짐
list.get(0); // index 0 출력
Iterator<Integer> iter = list.iterator(); // Iterator 선언
while(iter.hasNext()) { // 다음값이 있을 때 까지
   System.out.println(iter.next()); // 값 출력
}
6. 값 검색
list.contains(1); // true or false
list.indexOf(1); // 1이 있는 index 반환, 없으면 -1


Iterator(반복자)**
1. 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화한 것
2. 장점
   - 모든 컬렉션 프레임워크에서 공통으로 사용 가능하며 쉽게 값을 가져오고 제거할 수 있음
   - 3개의 메서드만 알면 되어서 사용하기 매우 쉬움
3. 단점
   - 처음부터 끝까지의 단방향 반복만 가능
   - 값을 변경하거나 추가가 불가능
   - 대량의 데이터 제어할 때 속도가 느림

1. Iterator 선언
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
Iterator<String> iterList = list.iterator();
2. 다음 값이 들어있는 지 확인
iterList.hasNext();
3. 다음 값 가져오기
iterList.next();
4. 값 삭제
iterList.remove(); // 반드시 next() 후에 사용해야 함

* 오버헤드: 어떤 처리를 하기 위해 들어가는 간접적인 처리 시간, 메모리 등의 컴퓨터 자원
* Collection Framework: List, Set, Map, Queue
 */
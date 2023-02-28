package Programmers.Lv2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],1)+1);
        }

        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            answer *= entry.getValue();
        }

        return answer -1;
    }
}

/*
Hash Map(해시맵)
1. 해싱을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보인다.
2. Map 인터페이스를 구현한 Map 컬렉션 중 하나이기 때문에 Map의 성질을 그대로 가지고 있다.
3. Key와 Value로 구성된 Entry 객체를 저장하는 구조이다.
4. 키는 맵에 유일하게 있어야 되고, 같은 키의 값 삽입시 해당 키의 값이 변경된다.
* Hashing: 통상적인 반복 비교를 통하지 않고 특정 계산만으로 자료 저장 주소를 찾아내는 탐색 방법

Hash Map 메서드
1. 선언
HashMap은 저장공간보다 값이 추가로 들어오면 List와 같이 저장공간을 추가로 늘리지만,
List와 다르게 한 칸씩이 아닌 두배로 늘리기 때문에 과부하가 많이 발생한다.
그래서 초기에 저장할 데이터 개수를 알고 있다면 Map의 초기 용량을 지정해 주는 것이 좋다.
HashMap<String, Integer> map1 = new HashMap<String,Integer>();
HashMap<String, Integer> map2 = new HashMap<>(); // new에서 타입 파라미터 생략 가능
HashMap<Integer,Integer> map3 = new HashMap<>(10); // 초기 용량 지정
2. 값 추가
map.put("One",1);
map.put("Two",2);
3. 값 삭제
특정 값만 제거하려면 remove, 모든 값을 제거하려면 clear() 메소드를 사용한다.
map.remove("One");
map.clear();
4. 값 출력
map.get("Two");
for(Map.Entry<String,Integer> entry : map.entrySet()) {
   entry.getKey();
   entry.getValue();
}
5. Value 값 증가시키기
map.put("파인애플",map.get("파인애플")+1); // 파인애플이라는 key가 없을 때 NullPointerException이 발생한다.
map.put("파인애플",map.getOrDefault("파인애플",0)+1); // key가 없으 시 디폴트 값을 넣는다.
6. 크기 구하기
map.size();
7. 특정 키 포함 여부
map.containsKey("One");
8. 같은지 비교
map.equals(map2);
 */
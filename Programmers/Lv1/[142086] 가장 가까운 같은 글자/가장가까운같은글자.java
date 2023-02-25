package Programmers.Lv1;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for(int i=1; i<s.length(); i++) {
            int x = s.lastIndexOf(s.substring(i,i+1),i-1);

            if(x==-1) {
                answer[i] = x;
            } else {
                answer[i] = i-x;
            }
        }

        return answer;
    }
}

/*
특정 문자 위치 찾기

indexOf() 메서드
: 특정 문자나 문자열을 앞에서부터 탐색해 처음 발견되는 인덱스를 반환하며 찾지 못할 경우 -1 반환
- indexOf(String str)
- indexOf(int ch)
- indexOf(int ch, int fromIndex)
- indexOf(String str, int fromIndex)

lastIndexOf() 메서드
: 특정 문자나 문자열을 뒤에서부터 탐색하여 처음 발견되는 인덱스를 변환하며 찾지 못할 경우 -1 반환
- lastIndexOf(String str)
- lastIndexOf(int ch)
- lastIndexOf(int ch, int fromIndex)
- lastIndexOf(String str, int fromIndex)
 */
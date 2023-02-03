package Programmers.Lv0;

class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]","");

        int answer = 0;
        for(char num: str.toCharArray()){
            answer += num -'0';
        }
        System.out.print(str);

        return answer;
    }
}

/*
문자 타입의 char를 정수 타입의 int로 변환하는 방법

1. 아스키코드 사용
: 아스키코드 표에서 문자 0~9는 48~57의 순서로 되어있어
문자 '0'의 아스키코드를 빼주면 원하는 숫자를 얻을 수 있다.
char c = '1';
int n = c - '0';

2. Character.getNumericValue()
char c = '1';
int n = Character.getNumericValue(c);

앞에 ^는 정규표현식에 해당하지 않는 경우를 의미하며, not과 같다.
 */
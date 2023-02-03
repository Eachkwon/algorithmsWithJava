package Programmers.Lv0;

import java.util.Arrays;

class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter,"");
    }
}

/*
1. 문자열.replace(바꾸고 싶은 문자, 바꿀 문자)
2. 문자열.replaceFirst(기존문자, 대체문자)
3. 문자열.replaceAll(정규식, 대체문자)
   : 문자열을 바꿀 때는 replace와 동일한 출력값, 특수문자 제거시 사용
 */
package Programmers.Lv1;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(String.valueOf(arr)).reverse();

        return sb.toString();
    }
}

/*
StringBuilder
: String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용하여 속도가 빠르며 상대적으로 부하가 적다.

생성자
StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder("abc");

메소드
.append(String str): 문자열을 추가한다.
.insert(int offset, String str): offset 위치에 str을 추가한다.
.replace(int start, int end, String s): start부터 end-1까지의 문자를 s로 대체한다.
.substring(int start, int end): start ~ end 이전까지의 내용만 담은 String 인스턴스를 생성하여 반환한다.
.deleteCharAt(int index): 인덱스에 위치한 문자 하나를 삭제한다.
.delete(int start, int end): start ~ end-1까지의 문자를 삭제한다.
.toString(): String으로 변환한다.
.reverse(): 해당 문자 전체를 뒤집는다.
 */
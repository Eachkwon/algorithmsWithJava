package Programmers.Lv2;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean blank = false;

        for(char c: s.toCharArray()) {
            if(c==' ') {
                sb.append(" ");
                blank = false;
            } else if (c<=57){
                sb.append(Character.toString(c));
                blank = true;
            } else if (!blank){
                sb.append(Character.toString(c-32));
                blank = true;
            } else {
                sb.append(String.valueOf(c));
            }
        }

        return sb.toString();
    }
}

/*
12.01ms → 0.15ms → 0.06ms
8.50ms → 0.15ms → 0.09ms
11.87ms → 0.18ms → 0.10ms

1. 공백을 기준으로 String[]에 담아 첫 글자만 대문자로 만들어 answer에 넣었다.
   런타임에러 및 제한조건(공백문자가 연속으로 나올 수 있음)때문에 실패가 떴다.

2. String 객체는 변경 불가능하기 때문에 가변적인 문자열 StringBuilder 객체를
   생성해 담은 후 String으로 변환하여 return하였다.
   이전보다 성능은 좋아졌지만 여전히 런타임에러 및 공백으로 실패가 떴다.

3. char[]에 담아 공백, 숫자, 첫글자 등의 조건을 기준으로 각각 처리하여
   StringBuilder 객체에 append하였다.
*/

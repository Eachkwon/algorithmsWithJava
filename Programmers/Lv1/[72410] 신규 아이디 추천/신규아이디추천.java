package Programmers.Lv1;

class Solution {
    public String solution(String new_id) {
        // 1,2단계: 소문자로 치환 및 영어, 숫자, 빼기, 밑줄, 마침표 제외한 모든 문자 제거
        String answer = new_id.toLowerCase().replaceAll("[^0-9a-z._-]","");

        // 3단계: 마침표 2번 이상 연속된 부분 제거
        StringBuffer sb = new StringBuffer();
        char c = answer.charAt(0);
        sb.append(c);
        for(int i=1; i<answer.length(); i++) {
            if(c=='.'&&c==answer.charAt(i)) {
                continue;
            } else {
                sb.append(answer.charAt(i));
                c = answer.charAt(i);
            }
        }
        answer = sb.toString();

        // 4단계: 마침표가 처음이나 끝에 위치할 경우 제거
        if(answer.length()>=1&&answer.charAt(0)=='.') answer = answer.substring(1,answer.length());
        if(answer.length()>=1&&answer.charAt(answer.length()-1)=='.') answer = answer.substring(0,answer.length()-1);

        // 5단계: 빈 문자열일 경우 a 대입
        if(answer.length()==0) answer = "a";

        // 6단계: 문자 길이가 16자 이상일 경우 첫 15개 문자 외에 제거, 끝에 마침표일 경우도 제거
        if(answer.length()>=16) answer = answer.substring(0,15);
        if(answer.charAt(answer.length()-1)=='.') answer = answer.substring(0,14);

        // 7단계: 2자 이하일 경우 길이가 3이 될 때 까지 마지막 문자 반복
        while(answer.length()<3) {
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }
}
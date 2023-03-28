package Programmers.Lv2;

import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        ArrayList<String> string1 = new ArrayList<>();
        ArrayList<String> string2 = new ArrayList<>();

        for(int i=0; i<str1.length()-1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i+1);
            if(a>='a'&&a<='z'&&b>='a'&&b<='z') {
                string1.add(a+""+b);
            }
        }

        for(int i=0; i<str2.length()-1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i+1);
            if(a>='a'&&a<='z'&&b>='a'&&b<='z') {
                string2.add(a+""+b);
            }
        }

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for(String str : string1) {
            if(string2.remove(str)) {
                intersection.add(str);
            }
            union.add(str);
        }

        double answer = 0;

        if(union.size()+string2.size()==0) {
            answer = 1;
        } else {
            answer = (double)intersection.size()/(double)(union.size()+string2.size());
        }

        return (int)(answer*65536);
    }
}

/*
처음에 string2에서 교집합을 뺀 나머지도 for문을 통해 union에 넣어줬었는데
속도 개선을 위해 for문을 빼고 if문에서 union.size()와 string2.size()를 더하여 나누는 것으로 변경했다.

변경 후 5번 테케에서 계속 실패가 떴다.
if문에서 union+string2의 사이즈가 아닌 union의 사이즈만 확인했기 때문에 발생한 오류였다.

코드를 변경할 때는 다른 코드에 영향을 주지는 않는지 한 번 더 확인하자!
 */
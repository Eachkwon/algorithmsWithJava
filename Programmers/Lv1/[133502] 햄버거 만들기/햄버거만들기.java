package Programmers.Lv1;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        StringBuffer sb = new StringBuffer();
        for(int n: ingredient) {
            sb.append(String.valueOf(n));
        }

        String str = sb.toString();
        while(str.contains("1231")) {
            int idx = str.indexOf("1231");

            str = str.substring(0,idx) + str.substring(idx+4);
            answer++;
        }

        return answer;
    }
}

/*
5760.25ms
7201.77ms
5837.08ms
 */
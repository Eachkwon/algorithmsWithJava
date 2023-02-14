package Programmers.Lv0;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] prnc = {"aya", "ye", "woo", "ma"};
        int[] lengArr = {3,2,3,2};

        for(int i=0; i<babbling.length; i++) {
            int count = 0;
            for(int j=0; j<prnc.length; j++) {
                if(babbling[i].contains(prnc[j])) {
                    count += lengArr[j];
                }
            }

            if(count!=0&&count==babbling[i].length()) {
                answer++;
            }
        }

        return answer;
    }
}

package Programmers.Lv1;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String bbl : babbling){
            if(bbl.contains("ayaaya")||bbl.contains("yeye")||
                    bbl.contains("woowoo")||bbl.contains("mama")) {
                continue;
            }

            bbl = bbl.replace("aya"," ");
            bbl = bbl.replace("ye"," ");
            bbl = bbl.replace("woo"," ");
            bbl = bbl.replace("ma"," ");
            bbl = bbl.replace(" ","");

            if(bbl.length()==0) {
                answer++;
            }
        }

        return answer;
    }
}

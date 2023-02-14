package Programmers.Lv0;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(int i=0; i<dic.length; i++) {
            if(dic[i].length()==spell.length) {
                int count = 0;
                for(int j=0; j<spell.length; j++) {
                    if(dic[i].contains(spell[j])) {
                        count++;
                    }

                    if(count==spell.length) {
                        return 1;
                    }
                }
            }
        }

        return answer;
    }
}

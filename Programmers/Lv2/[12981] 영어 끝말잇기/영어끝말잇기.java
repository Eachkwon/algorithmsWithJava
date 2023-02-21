package Programmers.Lv2;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char end = words[0].charAt(words[0].length()-1);

        for(int i=1; i<words.length; i++) {
            int idx = 0;
            for(String word: words) {
                if(word.equals(words[i])) {
                    break;
                }
                idx++;
            }

            if(end==words[i].charAt(0)&&idx==i) {
                end = words[i].charAt(words[i].length()-1);
                continue;
            } else if(i==words.length-1&&idx==i&&end==words[i].charAt(0)) {
                answer[0] = 0;
                answer[1] = 0;
            } else {
                if((i+1)%n!=0) {
                    answer[0] = (i+1)%n;
                    answer[1] = (i+1)/n+1;
                } else {
                    answer[0] = n;
                    answer[1] = (i+1)/n;
                }
                break;
            }
        }

        return answer;
    }
}

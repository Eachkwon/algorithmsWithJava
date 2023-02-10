package Programmers.Lv0;

class Solution {
    public String[] solution(String my_str, int n) {
        int leng = my_str.length()/n;
        if(my_str.length()%n!=0) {
            leng++;
        }

        String[] answer = new String[leng];
        int count = 0;

        for(int i=0; i<leng; i++) {
            if(count+n>my_str.length()){
                answer[i] = my_str.substring(count,my_str.length());
                break;
            }

            answer[i] = my_str.substring(count,count+n);
            count += n;
        }

        return answer;
    }
}

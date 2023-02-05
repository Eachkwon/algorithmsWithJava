package Programmers.Lv0;

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int ant = 0;

        if(hp>=5){
            ant = hp/5;
            answer += ant;
            hp -= 5*ant;
        }

        if(hp>=3){
            ant = hp/3;
            answer += ant;
            hp -= 3*ant;
        }

        answer += hp;

        return answer;
    }
}

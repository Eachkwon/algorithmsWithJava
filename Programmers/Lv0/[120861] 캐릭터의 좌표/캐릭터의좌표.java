package Programmers.Lv0;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[] {0,0};

        for(String act: keyinput) {
            if(act.equals("left")) {
                answer[0] -= 1;
                if(answer[0]< -board[0]/2) {
                    answer[0] = -board[0]/2;
                }
            } else if(act.equals("right")) {
                answer[0] += 1;
                if(answer[0]>board[0]/2) {
                    answer[0] = board[0]/2;
                }
            } else if(act.equals("up")) {
                answer[1] += 1;
                if(answer[1]>board[1]/2) {
                    answer[1] = board[1]/2;
                }
            } else if(act.equals("down")) {
                answer[1] -=1;
                if(answer[1]< -board[1]/2) {
                    answer[1] = -board[1]/2;
                }
            }
        }

        return answer;
    }
}

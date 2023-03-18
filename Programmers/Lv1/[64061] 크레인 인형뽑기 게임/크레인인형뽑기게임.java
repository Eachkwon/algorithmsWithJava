package Programmers.Lv1;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int move : moves) {
            int doll = 0;
            for(int i=0; i<board.length; i++) {
                if(board[i][move-1]!=0) {
                    doll = board[i][move-1];
                    board[i][move-1] = 0;
                    break;
                }
            }

            if(stack.isEmpty()&&doll!=0) {
                stack.push(doll);
            } else if(stack.isEmpty()&&doll==0) {
                continue;
            } else if(stack.peek()==doll) {
                stack.pop();
                answer += 2;
            } else if(stack.peek()!=doll) {
                stack.push(doll);
            }
        }

        return answer;
    }
}

package Programmers.Lv0;

class Solution {
    public int solution(int[][] board) {
        boolean[][] area = new boolean[board.length][board[0].length];

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j]==0) { continue; }

                for(int r= i-1; r<= i+1; r++) {
                    if(r<0 || r>=board.length) continue;
                    for(int c=j-1; c<=j+1; c++) {
                        if(c<0 || c>=board[0].length)  continue;

                        area[r][c] = true;
                    }
                }
            }
        }

        int answer = 0;
        for(boolean[] unsafes: area) {
            for(boolean unsafe: unsafes) {
                if(!unsafe) { answer++; }
            }
        }

        return answer;
    }
}

/*
채점결과가 계속 실패로 떴었는데 for문 안에서 area[i][j]를 true로 초기화하면서
지뢰가 이미 심어진 부분이 true로 다시 바뀌어 발생한 문제였다.

boolean의 기본값이 false이기 때문에 초기화하는 코드를 없애고 위험지역을 false → true로 변경하였다.
 */
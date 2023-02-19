package Programmers.Lv0;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        if(findSlope(dots[0],dots[1])==findSlope(dots[2],dots[3])) {
            return 1;
        }
        if(findSlope(dots[0],dots[2])==findSlope(dots[1],dots[3])) {
            return 1;
        }
        if(findSlope(dots[0],dots[3])==findSlope(dots[2],dots[1])) {
            return 1;
        }
        return answer;
    }

    public float findSlope(int[] a, int[] b) {
        return (float)(b[1]-a[1])/(b[0]-a[0]);
    }
}

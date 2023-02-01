package Programmers.Lv0;

class Solution {
    public int solution(int[] array, int height) {
        int count = 0;

        for(int other : array){
            if(other>height){
                count++;
            }
        }
        return count;
    }
}

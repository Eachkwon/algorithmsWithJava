package Programmers.Lv0;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int leng = 0;

        for(int num: numlist) {
            if(num%n==0) {
                leng++;
            }
        }

        int[] answer = new int[leng];
        int count = 0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0) {
                answer[count] = numlist[i];
                count++;
            }
        }

        return answer;
    }
}

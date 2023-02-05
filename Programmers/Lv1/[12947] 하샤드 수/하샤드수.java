package Programmers.Lv1;

class Solution {
    public boolean solution(int x) {
        int leng = Integer.toString(x).length();
        int sum = 0;
        int number = x;

        for(int i=0; i<leng; i++){
            sum += number%10;
            number /= 10;
        }

        if(x%sum!=0){
            return false;
        }

        return true;

    }
}
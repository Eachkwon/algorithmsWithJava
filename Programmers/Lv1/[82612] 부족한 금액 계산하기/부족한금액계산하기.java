package Programmers.Lv1;

class Solution {
    public long solution(int price, int money, int count) {
        long fee = price;
        long sum = 0;

        for(int i=0; i<count; i++){
            sum += fee;
            fee += price;
        }

        if(money>=sum) {
            return 0;
        }

        return Math.abs(money-sum);
    }
}
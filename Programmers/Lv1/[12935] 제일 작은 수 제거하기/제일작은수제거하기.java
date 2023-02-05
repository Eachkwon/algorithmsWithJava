package Programmers.Lv1;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[] {-1};
        }

        int minimum = arr[0];
        for(int num: arr){
            if(num<minimum){
                minimum = num;
            }
        }

        int[] answer = new int[arr.length-1];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=minimum) {
                answer[count] = arr[i];
                count++;
            }
        }

        return answer;
    }
}
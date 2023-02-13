package Programmers.Lv1;

class Solution {
    public int[] solution(int[] numbers) {
        int[] arr = new int[200];

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                arr[numbers[i]+numbers[j]]++;
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                count++;
            }
        }

        int[] answer = new int[count];
        int n =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                answer[n] = i;
                n++;
            }
        }

        return answer;
    }
}

package Programmers.Lv0;

class Solution {
    public int solution(int[] array) {
        int[] arr = new int[1000];
        for(int i=0; i<array.length; i++) {
            arr[array[i]]++;
        }

        int max = 0;
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==max) {
                count++;
            }
        }

        if(count!=1) {
            return -1;
        }

        return index;
    }
}

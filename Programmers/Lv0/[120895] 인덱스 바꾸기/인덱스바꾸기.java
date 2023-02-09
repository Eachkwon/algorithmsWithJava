package Programmers.Lv0;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr1 = my_string.toCharArray();
        char[] arr2 = my_string.toCharArray();

        for(int i=0; i<arr1.length; i++) {
            if(i==num1) {
                arr1[i] = arr2[num2];
            }

            if(i==num2) {
                arr1[i] = arr2[num1];
            }
        }

        return String.valueOf(arr1);
    }
}
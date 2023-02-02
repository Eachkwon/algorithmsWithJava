package Programmers.Lv1;

class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;

        char[] arr = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(arr[i]).equalsIgnoreCase("p")) {
                p++;
            } else if(String.valueOf(arr[i]).equalsIgnoreCase("y")) {
                y++;
            }
        }

        if(p==y) {
            return true;
        }
        return false;
    }
}
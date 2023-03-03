package Programmers.Lv1;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[][] arr = new int[wallpaper.length][wallpaper[0].length()];

        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j)=='.') {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

        int up = 50, down = 0, left = 50, right = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j]==1&&i<up) up = i;
                if(arr[i][j]==1&&i>down) down = i;
                if(arr[i][j]==1&&j<left) left = j;
                if(arr[i][j]==1&&j>right) right = j;
            }
        }

        return new int[] {up,left,down+1,right+1};
    }
}

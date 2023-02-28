package Programmers.Lv2;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2[0].length; j++) {
                for(int k=0; k<arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}

/*
answer[0][0] = arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[1][0]
answer[0][1] = arr1[0][0]*arr2[0][1] + arr1[0][1]*arr2[1][1]
answer[i][j] = arr1[i][0]*arr2[j][1] + arr1[i][0]*arr2[j][1]
answer[i][j] += arr1[i][k]*arr2[j][k] // k는 arr1행렬의 열과 arr2행렬의 행 개수
 */
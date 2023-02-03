package Programmers.Lv0;
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        if(sides[2]>=sides[0]+sides[1]) {
            return 2;
        }
        return 1;
    }
}

/*
배열 최대값, 최소값 구하는 방법
int arr[] = {1, 2, 3}

1. for를 이용한 방법
int max = arr[0];
for(int i=1; i<arr.length; i++) {
        if(arr[i]>max) {
              max = arr[i];
        }
}

2. Arrays.sort를 이용한 방법
Arrays.sort(arr);
int max = arr[arr.length-1];
int min = arr[0];

3. Stream을 이용한 방법
int max = Arrays.stream(arr).max().getAsInt();
int min = Arrays.stream(arr).min().getAsInt();
 */

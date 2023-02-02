package Programmers.Lv0;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int leng = numbers.length;

        return numbers[leng-1]*numbers[leng-2];
    }
}
package Programmers.Lv2;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int idx = 0;

        while(idx+10<=discount.length) {
            int[] arr = new int[number.length];

            for(int i=0; i<10; i++) {
                for(int j=0; j<want.length; j++) {
                    if(want[j].equals(discount[i+idx])) arr[j]++;
                }
            }

            int leng = 0;
            for(int i=0; i<number.length; i++) {
                if(number[i]!=arr[i]) break;
                leng++;
            }

            if(leng==number.length) answer++;

            idx++;
        }

        return answer;
    }
}
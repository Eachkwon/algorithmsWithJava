package Programmers.Lv2;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        while(n>0) {
            sb.append(n%k);
            n /= k;
        }
        String[] arr = sb.reverse().toString().split("0");

        for(String str : arr) {
            if(str.equals("")||str.equals("1")) continue;
            long num = Long.parseLong(str);
            boolean flag = true;

            for(int i=2; i<=Math.sqrt(num); i++) {
                if(num%i==0) {
                    flag = false;
                    break;
                }
            }

            if(flag) answer++;
        }

        return answer;
    }
}
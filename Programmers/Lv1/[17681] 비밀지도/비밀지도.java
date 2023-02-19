package Programmers.Lv1;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String a;

        for(int i=0; i<n; i++){
            a = Integer.toBinaryString(arr1[i] | arr2[i]);

            if(a.length()!=n) {
                StringBuilder z = new StringBuilder();
                for(int j=0; j<n-a.length(); j++){
                    z.append("0");
                }
                a = z.toString() + a;
            }

            StringBuilder sb = new StringBuilder();
            for(int k=0; k<n; k++) {
                if(a.charAt(k)=='0'){
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}

/*
2.18ms → 0.07ms
2.22ms → 1.36ms
3.88ms → 1.19ms
 */
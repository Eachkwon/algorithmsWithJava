package Programmers.Lv2;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String a, b, z;

        for(int i=0; i<n; i++){
            a = Integer.toBinaryString(arr1[i]);
            b = Integer.toBinaryString(arr2[i]);

            if(a.length()!=n) {
                z = "";
                for(int j=0; j<n-a.length(); j++){
                    z += "0";
                }
                a = z + a;
            }

            if(b.length()!=n) {
                z = "";
                for(int j=0; j<n-b.length(); j++){
                    z += "0";
                }
                b = z + b;
            }

            StringBuilder sb = new StringBuilder();
            for(int k=0; k<n; k++) {
                if(a.charAt(k)=='0'&&b.charAt(k)=='0'){
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
2.18ms
2.22ms
3.88ms 
 */

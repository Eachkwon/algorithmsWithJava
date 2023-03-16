package Programmers.Lv1;

class Solution {
    public int[] solution(int N, int[] stages) {
        float[] arr = new float[N];

        for(int i=1; i<=N; i++) {
            int a = 0;
            int b = 0;

            for(int stage: stages) {
                if(stage==i) {
                    a++;
                    b++;
                } else if(stage>i) {
                    b++;
                }
            }

            if(b==0) {
                arr[i-1] = 0;
                continue;
            }

            arr[i-1] = (float)a/b;
        }

        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            float max = -1;
            int idx = 0;

            for(int j=0; j<arr.length ;j++) {
                if(arr[j]>max) {
                    max = arr[j];
                    idx = j;
                }
            }
            answer[i] = idx+1;
            arr[idx] = -1;
        }


        return answer;
    }
}
package Programmers.Lv1;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] arr = new int[2];

        for(int i=0; i<lottos.length; i++) {
            for(int j=0; j<lottos.length; j++) {
                if(lottos[i]==win_nums[j]) arr[1]++;
            }
        }

        arr[0] = arr[1];
        for(int num: lottos) {
            if(num==0) arr[0]++;
        }

        for(int i=0; i<arr.length; i++) {
            answer[i] = 6;
            if(arr[i]==6) answer[i] = 1;
            if(arr[i]==5) answer[i] = 2;
            if(arr[i]==4) answer[i] = 3;
            if(arr[i]==3) answer[i] = 4;
            if(arr[i]==2) answer[i] = 5;
        }

        return answer;
    }
}

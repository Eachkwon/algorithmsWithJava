package Programmers.Lv0;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        int count = 0;
        for(String str : quiz){
            String[] arr = str.split(" ");
            int num = Integer.parseInt(arr[0]);

            if(arr[1].equals("-")) {
                num -= Integer.parseInt(arr[2]);
            } else {
                num += Integer.parseInt(arr[2]);
            }

            if(num==Integer.parseInt(arr[arr.length-1])){
                answer[count] = "O";
            } else {
                answer[count] = "X";
            }
            count++;
        }

        return answer;
    }
}

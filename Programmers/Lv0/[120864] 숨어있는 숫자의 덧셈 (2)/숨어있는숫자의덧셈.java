package Programmers.Lv0;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String str = my_string.replaceAll("[^0-9]"," ");
        String[] arr = str.split("");

        for(int i=0; i<arr.length; i++) {
            if(i==arr.length-1&&!arr[i].equals(" ")) {
                answer += Integer.parseInt(arr[i]);
            } else if(!arr[i].equals(" ")&&!arr[i+1].equals(" ")&&!arr[i+2].equals(" ")) {
                answer += Integer.parseInt(arr[i])*100;
                answer += Integer.parseInt(arr[i+1])*10;
                answer += Integer.parseInt(arr[i+2]);
                i+=3;
            } else if(!arr[i].equals(" ")&&!arr[i+1].equals(" ")) {
                answer += Integer.parseInt(arr[i])*10;
                answer += Integer.parseInt(arr[i+1]);
                i+=2;
            } else if(!arr[i].equals(" ")){
                answer += Integer.parseInt(arr[i]);
            }
        }

        return answer;
    }
}
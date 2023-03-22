package Programmers.Lv1;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuffer sb = new StringBuffer();
        String[] strArr = {"R","T","C","F","J","M","A","N"};
        int[] intArr = new int[8];
        int a = 0, b = 0;

        for(int i=0; i<survey.length; i++) {
            for(int j=0; j<strArr.length; j++) {
                if(survey[i].substring(0,1).equals(strArr[j])) a = j;
                if(survey[i].substring(1).equals(strArr[j])) b = j;
            }

            switch(choices[i]) {
                case 1: intArr[a] += 3;
                    break;
                case 2: intArr[a] += 2;
                    break;
                case 3: intArr[a] += 1;
                    break;
                case 4:
                    break;
                case 5: intArr[b] += 1;
                    break;
                case 6: intArr[b] += 2;
                    break;
                case 7: intArr[b] += 3;
                    break;
            }
        }

        int idx = 0;
        while(idx!=8) {
            a = intArr[idx];
            b = intArr[idx+1];

            if(a>=b) {
                sb.append(strArr[idx]);
                idx += 2;
            } else {
                sb.append(strArr[idx+1]);
                idx += 2;
            }
        }

        return sb.toString();
    }
}
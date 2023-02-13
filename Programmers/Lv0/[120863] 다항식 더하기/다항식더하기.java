package Programmers.Lv0;

class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int x = 0;
        int n = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i].contains("x")) {
                if(arr[i].replaceAll("[^0-9]","").equals("")){
                    x+= 1;
                } else {
                    x += Integer.parseInt(arr[i].replaceAll("[^0-9]",""));
                }
            } else if(arr[i].contains("+")) {

            } else {
                n += Integer.parseInt(arr[i]);
            }
        }

        if(x==0&&n==0) {
            return "";
        } else if(x==0&&n!=0) {
            return Integer.toString(n);
        } else if(x==1&&n==0) {
            return "x";
        } else if(n==0) {
            return x+"x";
        } else if(x==1&&n!=0) {
            return "x + "+n;
        }

        return x+"x + "+n;
    }
}

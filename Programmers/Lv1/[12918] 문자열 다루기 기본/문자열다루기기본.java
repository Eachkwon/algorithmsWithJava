package Programmers.Lv1;

class Solution {
    public boolean solution(String s) {
        String check = s.replaceAll("[^0-9]","");

        if(check.length()==s.length()&&s.length()==4){
            return true;
        } else if(check.length()==s.length()&&s.length()==6){
            return true;
        }

        return false;
    }
}

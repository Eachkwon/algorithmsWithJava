package Programmers.Lv1;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<s.length(); i++) {
            int c = s.charAt(i);
            for( int j=0; j<index; j++) {
                do {
                    c++;
                    if(c>122) c -= 26;
                } while(skip.indexOf(c)!=-1);
            }

            sb.append((char)c);
        }

        return sb.toString();
    }
}

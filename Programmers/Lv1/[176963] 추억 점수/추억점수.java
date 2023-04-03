package Programmers.Lv1;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i=0; i<photo.length; i++) {
            int total = 0;

            for(String n : photo[i]) {
                for(int j=0; j<name.length; j++) {
                    if(name[j].equals(n)) total += yearning[j];
                }
            }
            answer[i] = total;
        }

        return answer;
    }
}
package Programmers.Lv2;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        for(String skill_tree : skill_trees) {
            String s = skill_tree;
            int cnt = 0;

            for(int i=0; i<skill_tree.length(); i++) {
                String str = skill_tree.substring(i,i+1);
                if(!skill.contains(str)) {
                    s = s.replace(str,"");
                } else if(!str.equals(skill.substring(cnt,cnt+1))) {
                    answer--;
                    break;
                } else {
                    cnt++;
                }
            }
        }

        return answer;
    }
}
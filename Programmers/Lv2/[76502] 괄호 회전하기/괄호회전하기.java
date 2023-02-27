package Programmers.Lv2;

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
            String str = s.substring(i) + s.substring(0,i);
            Stack<Character> stack = new Stack<>();

            for(char c : str.toCharArray()) {
                if(stack.isEmpty()) {
                    stack.push(c);
                } else if(stack.peek()=='('&&c==')') {
                    stack.pop();
                } else if(stack.peek()=='['&&c==']') {
                    stack.pop();
                } else if(stack.peek()=='{'&&c=='}') {
                    stack.pop();
                } else if(c=='('||c=='['||c=='{') {
                    stack.push(c);
                } else {
                    break;
                }
            }

            if(stack.isEmpty()) answer++;
        }
        return answer;
    }
}
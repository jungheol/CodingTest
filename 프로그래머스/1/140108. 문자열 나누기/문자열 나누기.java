import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
    
        while(!s.equals("")) {
            char c = s.charAt(0);
            int count = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) count++;
                else count--;
                
                if(count == 0) {
                    if(i < s.length()) {
                        s = s.substring(i+1);
                        answer++;
                    } else {
                        s = "";
                        answer++;
                    }
                    break;
                }
                
                if(i == (s.length() -1)) {
                    s = "";
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
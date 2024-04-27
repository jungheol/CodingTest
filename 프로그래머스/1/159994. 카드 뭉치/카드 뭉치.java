import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList();
        Queue<String> queue2 = new LinkedList();

        for (String item : cards1) {
            queue1.offer(item);
        }
        for (String item : cards2) {
            queue2.offer(item);
        }
        int count = 0;
        String answer = "";
        for (int i = 0; i < goal.length; i++) {
            if(!queue1.isEmpty() && queue1.peek().equals(goal[count])) {
                queue1.poll();
                count++;
            } else if(!queue2.isEmpty() && queue2.peek().equals(goal[count])) {
                queue2.poll();
                count++;
            } else {
                answer = "No";
                break;
            }
        }

        if(count == goal.length) answer = "Yes";
        return answer;
    }
}
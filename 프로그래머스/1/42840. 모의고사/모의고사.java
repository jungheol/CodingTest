import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if(a[i % a.length] == answers[i]) count[0]++;
            if(b[i % b.length] == answers[i]) count[1]++;
            if(c[i % c.length] == answers[i]) count[2]++;
        }
        int max = Math.max(Math.max(count[0], count[1]), count[2]);
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < count.length; i++) {
            if(count[i] == max) list.add(i+1);
        }
        return list;
    }
}
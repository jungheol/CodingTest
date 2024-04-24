import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String s) {
        HashSet<Character> set = new HashSet();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                list.add(-1);
            }
            else {
                for (int j = i-1; j >= 0; j--) {
                    if (s.charAt(i) == s.charAt(j)) {
                        if(min > i-j) min = i-j;
                        list.add(min);
                        break;
                    }
                }
            }
        }
        return list;
    }
}
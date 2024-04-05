import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if(i % 2 != 0) list.add(i);
        }
        return list;
    }
}
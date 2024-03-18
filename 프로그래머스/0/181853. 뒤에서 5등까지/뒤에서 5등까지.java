import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        Arrays.sort(num_list);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 5; i++) {
            list.add(num_list[i]);
        }
        return list;
    }
}
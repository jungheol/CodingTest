import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        
        ArrayList<Integer> finalList = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rank.length; j++) {
                if(list.get(i) == rank[j]) finalList.add(j);
            }
        }
        return answer = finalList.get(0) * 10000 + finalList.get(1) * 100 + finalList.get(2);
    }
}
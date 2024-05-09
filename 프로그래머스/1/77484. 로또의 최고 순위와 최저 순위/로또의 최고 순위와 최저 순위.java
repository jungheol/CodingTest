import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int countZero = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int lotto : lottos) {
            if(lotto == 0) {
                countZero++;
                continue;
            }
            list.add(lotto);
        }
        
        for (int winNum : win_nums) {
            if(list.contains(winNum)) count++;
        }
        
        int maxRank = 7 - (count + countZero);
        int minRank = 7 - (count);
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;
        
        return new int[] {maxRank, minRank};
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            maxX = Math.max(sizes[i][0], maxX);
            maxY = Math.max(sizes[i][1], maxY);
        }
    
        return maxX * maxY;
    }
}
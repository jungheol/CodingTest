import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int countZero = 0;
        int count = 0;
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) countZero++;
        }
        Arrays.sort(lottos);
        for (int i = countZero; i < win_nums.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) count++;
            }
        }

        int[] answer = new int[2];
        answer[0] = count+countZero == 6 ? 1 : count+countZero == 5 ? 2 : count+countZero == 4 ? 3 : count+countZero == 3 ? 4 : count+countZero == 2 ? 5 : 6;
        answer[1] = count == 6 ? 1 : count == 5 ? 2 : count == 4 ? 3 : count == 3 ? 4 : count == 2 ? 5 : 6;
        
        return answer;
    }
}
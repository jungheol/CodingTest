import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> answer = new ArrayList();
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int last = commands[i][1];
            int select = commands[i][2]-1;
            for (int j = start; j < last; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer.add(list.get(select));
            list.clear();
        }
        return answer;
    }
}
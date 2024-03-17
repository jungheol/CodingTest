import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            firstList.add(arr[i]);
            for (int j = 0; j < firstList.get(i); j++) {
                finalList.add(firstList.get(i));
            }
        }
        
        int[] answer = new int[finalList.size()];
        
        for(int i = 0; i < finalList.size(); i++) {
            answer[i] = finalList.get(i).intValue();
        }
        
        return answer;
    }
}
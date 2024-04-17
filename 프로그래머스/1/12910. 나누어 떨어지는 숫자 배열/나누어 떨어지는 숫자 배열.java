import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) count++;
        }
        if(count == 0) return new int[]{-1};
        
        int[] answer = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[count] = arr[i];
                count++;
            }
        }
        
        int tmp = 0;
        for (int i = 0; i < answer.length; i++) {
            for(int j = 0 ; j < answer.length; j++)
                if(arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
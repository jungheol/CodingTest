import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length; j++)
                if(arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : arr) {
            if(n % divisor == 0) list.add(n);
        }
        
        if(list.isEmpty()) list.add(-1);
        
        return list;
    }
}
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(list.contains(arr[i])) continue;
            else list.add(arr[i]);
        }
        
        if(list.size() > k) {
            for(int i = list.size(); i > k; i--)
            list.remove(k);
        } else {
            for(int i = list.size(); i < k; i++)
            list.add(-1);
        }
        
        return list;
    }
}
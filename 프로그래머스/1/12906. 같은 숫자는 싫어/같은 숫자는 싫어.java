import java.util.*;

public class Solution {
    public Object[] solution(int []arr) {
        Stack st = new Stack();
        for(int i=0; i<arr.length; i++) {
            if(st.isEmpty() || (int)st.peek() != arr[i])
                st.push(arr[i]);
        }
        return st.toArray();
    }
}
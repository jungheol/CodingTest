import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Stack<Character> st = new Stack();
            int count = 0;
            boolean isSpa = true;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '(') {
                    st.push(s.charAt(j));
                    count++;
                } else if(st.isEmpty()) {
                    isSpa = false;
                    break;
                } else {
                    st.pop();
                    count--;
                }
            }
            if(!st.isEmpty()) isSpa = false;
            
            if(isSpa) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
    }
}
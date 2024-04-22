import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int v = Integer.parseInt(br.readLine());
        
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(N[i])) {
                map.put(N[i], map.get(N[i]) + 1);
            } else {
                map.put(N[i], 1);
            }
        }
        if(map.containsKey(v)) System.out.println(map.get(v));
        else System.out.println("0");
    }
}
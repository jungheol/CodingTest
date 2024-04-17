import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] num = new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int min = num[0];
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if(min > num[i]) min = num[i];
            if(max < num[i]) max = num[i];
        }
        System.out.println(min + " " + max);
    }
}

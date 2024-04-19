import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);


        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(i+1);
        }

        int index = 0;
        StringBuffer sb = new StringBuffer();
        sb.append("<");

        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size();
            if (list.size() == 1) sb.append(list.remove(index));
            else sb.append(list.remove(index) + ", ");
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
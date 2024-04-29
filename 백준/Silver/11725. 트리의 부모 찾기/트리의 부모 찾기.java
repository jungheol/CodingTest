import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static ArrayList<ArrayList<Integer>> list;
    private static int[] parents;
    private static boolean[] visited;
    // 백준 입력 포멧
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n-1; i++) {
            String[] s = br.readLine().split(" ");
            list.get(Integer.parseInt(s[0])).add(Integer.parseInt(s[1]));
            list.get(Integer.parseInt(s[1])).add(Integer.parseInt(s[0]));
        }

        parents = new int[n+1];
        visited = new boolean[n+1];

        dfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
        
        private static void dfs(int currentNode) {
            visited[currentNode] = true;

            for (int item : list.get(currentNode)) {
                if(!visited[item]) {
                    parents[item] = currentNode;
                    dfs(item);
                }
            }
        }
    }
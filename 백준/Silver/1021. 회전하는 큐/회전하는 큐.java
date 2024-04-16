import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        int[] seq = new int[M];
        LinkedList<Integer> deque = new LinkedList();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        for (int i = 0; i < M; i++) {
            seq[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int target = deque.indexOf(seq[i]);
            int halfIdx = 0;

            if(deque.size() % 2 == 0) {
                halfIdx = deque.size()/2-1;
            } else {
                halfIdx = deque.size()/2;
            }

            if (target <= halfIdx) {
                for (int j = 0; j < target; j++) {
                    int tmp = deque.pollFirst();
                    deque.addLast(tmp);
                    count++;
                }
            } else {
                for (int j = 0; j < deque.size() - target; j++) {
                    int tmp = deque.pollLast();
                    deque.addFirst(tmp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    
        sc.nextLine();
        String[] st = sc.nextLine().split(" ");
        int[] num = new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[N-1]);
    }
}

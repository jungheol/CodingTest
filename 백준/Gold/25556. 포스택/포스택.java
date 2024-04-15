import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<n; i++) {
            numbers[i] = Integer.parseInt(sc.next());
        }
        Stack st0 = new Stack();
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        Stack st3 = new Stack();
        String answer = "YES";
        st0.push(numbers[0]);

        for(int i=1; i<numbers.length; i++) {
            if ((int) st0.peek() < numbers[i])
                st0.push(numbers[i]);
            else if (st1.isEmpty() || (int) st1.peek() < numbers[i])
                st1.push(numbers[i]);
            else if (st2.isEmpty() || (int) st2.peek() < numbers[i])
                st2.push(numbers[i]);
            else if (st3.isEmpty() || (int) st3.peek() < numbers[i])
                st3.push(numbers[i]);
            else {answer = "NO"; break;}
        }
        System.out.println(answer);
    }
}

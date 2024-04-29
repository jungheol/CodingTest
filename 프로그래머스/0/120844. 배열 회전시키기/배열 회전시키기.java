import java.util.*;

class Solution {
    public Deque<Integer> solution(int[] numbers, String direction) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (Integer item : numbers) {
            deque.add(item);
        }
        if(direction.equals("left")) {
            deque.addLast(deque.removeFirst());
        } else {
            deque.addFirst(deque.removeLast());
        }
        return deque;
    }
}
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> list = new LinkedList();
        for (int i : priorities) {
            list.add(i);
        }
        do {
            int tmp = list.poll();
            boolean isPeek = true;
            if(location == 0) {
                for (int i = 0; i < list.size(); i++) {
                    if(tmp < list.get(i)) {
                        list.add(tmp);
                        isPeek = false;
                        break;
                    }
                }
                if(isPeek) {
                    answer++;
                    return answer;
                }
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if(tmp < list.get(i)) {
                        list.add(tmp);
                        isPeek = false;
                        break;
                    }
                }
                if(isPeek) {
                    answer++;
                }
            }

            location--;
            if(location < 0) {
                location += list.size();
            }
        } while (!list.isEmpty());

        return answer;
    }
}
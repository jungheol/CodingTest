import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < clothes.length; i++) {
            if(map.containsKey(clothes[i][1])) map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            else map.put(clothes[i][1], 1);
        }

        if(map.size() == 1) return map.get(clothes[0][1]);
        else {
            for (String key: map.keySet()) {
                answer *= map.get(key) + 1;
            }
        }

        return answer - 1;
    }
}
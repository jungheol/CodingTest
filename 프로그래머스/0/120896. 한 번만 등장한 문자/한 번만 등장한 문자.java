import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]) + 1);
                if(list.contains(str[i])) list.remove(str[i]);
            } else {
                map.put(str[i], 1);
                list.add(str[i]);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            sb.append(item);
        }
        return sb.toString();
    }
}
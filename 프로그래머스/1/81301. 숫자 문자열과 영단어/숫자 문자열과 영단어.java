import java.util.*;

class Solution {
    public int solution(String s) {
        String[] ss = s.split("");
        StringBuffer sb = new StringBuffer();
        StringBuffer answer = new StringBuffer();
        HashMap<String, String> map = new HashMap();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        for (int i = 0; i < ss.length; i++) {
            sb.append(ss[i]);
            if(map.containsValue(sb.toString())) {
                answer.append(sb);
                sb.delete(0, sb.length());
            }
            if(map.containsKey(sb.toString())) {
                answer.append(map.get(sb.toString()));
                sb.delete(0, sb.length());
            }
        }
        return Integer.parseInt(answer.toString());
    }
}
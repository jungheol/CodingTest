import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].indexOf("ad") == -1) {
                list.add(strArr[i]);
            } else {
                continue;
            }
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}
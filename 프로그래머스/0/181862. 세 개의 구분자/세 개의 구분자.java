import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String reA = myStr.replace("a", " ");
        String reB = reA.replace("b", " ");
        String reC = reB.replace("c", " ");
        String[] split = reC.split(" ");
        ArrayList<String> list = new ArrayList<>();
        
        for (String str : split) {
            if(!str.equals("")) list.add(str);
        }
        String[] answer = {};
        if(list.size() == 0) {
            list.add("EMPTY");
        }
        return list.toArray(answer);
    }
}
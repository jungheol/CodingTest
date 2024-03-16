import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String[] splitArray = new String[]{};
        splitArray = my_string.split(" ");
        
        for(String cha : splitArray) {
            if(!cha.equals("")) list.add(cha);
        }
        
        String[] answer = new String[list.size()];
        
        return list.toArray(answer);
    }
}
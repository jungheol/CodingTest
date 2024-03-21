import java.util.*;

class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] splitArr = n_str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < splitArr.length; i++) {
            if(!splitArr[i].equals("0")) {
                for(int j=i; j < splitArr.length; j++) {
                    stringBuilder.append(splitArr[j]);
                }
                break;
            }
        }
        
        return stringBuilder.toString();
    }
}
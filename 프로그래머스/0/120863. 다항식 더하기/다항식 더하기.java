import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int strNum = 0;
        int num = 0;
        String[] arr = polynomial.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("+")) continue;
            if(arr[i].equals("x")) strNum++;
            else if(arr[i].contains("x")) {
                String[] arrNum = arr[i].split("x");
                strNum += Integer.parseInt(arrNum[0]);
            } else {
                num += Integer.parseInt(arr[i]);
            }
        }
                
        if(num == 0) {
            if(strNum == 0) return "";
            else if(strNum == 1) return "x";
            else return strNum + "x";
        } else {
            if(strNum == 0) return String.valueOf(num);
            else if(strNum == 1) return "x + " + num;
            else return strNum + "x + " + num;
        }
    }
}
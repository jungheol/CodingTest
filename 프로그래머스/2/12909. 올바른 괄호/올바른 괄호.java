class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");
        if(arr[0].contains(")")) return false;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("(")) count++;
            else count--;
            
            if(count < 0) return false;
        }
        
        if(count == 0 && arr[arr.length-1].contains(")")) return true;
        else return false;
    }
}
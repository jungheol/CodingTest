class Solution {
    public int solution(String my_string, String is_suffix) {
        boolean isEnd = false;
        
        isEnd = my_string.endsWith(is_suffix);
        
        if(isEnd) return 1;
        else return 0;
    }
}
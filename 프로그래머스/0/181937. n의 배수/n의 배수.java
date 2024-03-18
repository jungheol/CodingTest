class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        int i = num % n;
        
        if(i == 0) answer = 1;
        else answer = 0;
        
        return answer;
    }
}
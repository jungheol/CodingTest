class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int num = my_string.length()/m;
        String[][] strArr = new String[num][m];
        int sum = 0;
        for(int i = 0; i < strArr.length; i++) {
            for(int j = 0; j < m; j++) {
                strArr[i][j] = my_string.substring(sum, sum+1);
                sum++;
            }
            answer += strArr[i][c-1];
        }
        
        return answer;
    }
}
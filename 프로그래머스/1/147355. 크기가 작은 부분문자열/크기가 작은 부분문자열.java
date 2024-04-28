class Solution {
    public int solution(String t, String p) {
        int n = t.length() - p.length() + 1;
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = t.substring(i, i+p.length());
        }
        int answer = 0;
        for (int i = 0; i < strArr.length; i++) {
            if(Long.parseLong(strArr[i]) <= Long.parseLong(p)) answer++; 
        }
        return answer;
    }
}
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(" ");

            int result = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]) * (tmp[1].equals("+") ? 1 : -1);
            answer[i] = result == Integer.parseInt(tmp[4]) ? "O" : "X";
        }
        
        return answer;
    }
}
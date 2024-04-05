class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(" ");

            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[2]);
            int c = Integer.parseInt(tmp[4]);

            if(tmp[1].equals("+")) answer[i] = (a + b == c) ? "O" : "X";
            else if (tmp[1].equals("-")) answer[i] = (a - b == c) ? "O" : "X";
        }
        
        return answer;
    }
}
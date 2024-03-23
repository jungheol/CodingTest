

class Solution {
        public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int xSize = Math.abs(board[0]/2);
        int ySize = Math.abs(board[1]/2);

        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("up")) {
                answer[1] += (ySize > answer[1] ? 1:0);
            } else if(keyinput[i].equals("down")) {
                answer[1] -= (-ySize < answer[1] ? 1:0);
            } else if(keyinput[i].equals("right")) {
                answer[0] += (xSize > answer[0] ? 1:0);
            } else if(keyinput[i].equals("left")) {
                answer[0] -= (-xSize < answer[0] ? 1:0);
            }
        }
        return answer;
        }
}
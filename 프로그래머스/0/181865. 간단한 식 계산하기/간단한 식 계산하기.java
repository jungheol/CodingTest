class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] splitArr = binomial.split(" ");
        
        if(splitArr[1].equals("+")) {
            answer = Integer.parseInt(splitArr[0]) + Integer.parseInt(splitArr[2]);
        } else if(splitArr[1].equals("-")) { 
            answer = Integer.parseInt(splitArr[0]) - Integer.parseInt(splitArr[2]);
        } else if(splitArr[1].equals("*")) {
            answer = Integer.parseInt(splitArr[0]) * Integer.parseInt(splitArr[2]);
        }
        return answer;
    }
}
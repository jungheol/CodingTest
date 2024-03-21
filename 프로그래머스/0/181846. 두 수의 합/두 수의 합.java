import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);
        BigInteger e = c.add(d);
        
        return answer = e.toString();
    }
}
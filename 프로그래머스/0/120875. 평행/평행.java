class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        for (int i = 0; i < dots.length; i++) {
            double a = incline(dots[i], dots[(i+1)%4]);
            double b = incline(dots[(i+2)%4], dots[(i+3)%4]);
            
            if(a == b) return 1;
        }
        return answer;
    }
    
    public double incline(int[] a, int[] b) {
        double inc = 0;
        inc = (double) (a[1] - b[1]) / (a[0] - b[0]);
        return inc;
    }
}
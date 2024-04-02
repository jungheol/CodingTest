class Solution {
    public int[] solution(int[] numlist, int n) {
        for(int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                int temp = 0;
                if (Math.abs(n - numlist[i]) < Math.abs(n - numlist[j])) {
                    temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                } else if (Math.abs(n - numlist[i]) == Math.abs(n - numlist[j])) {
                    if(numlist[i] > numlist[j]) {
                        temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
            }
        }
        return numlist;
    }
}
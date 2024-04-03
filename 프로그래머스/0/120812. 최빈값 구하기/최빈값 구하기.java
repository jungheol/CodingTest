class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1000];
        
        if(array.length == 1) return array[0];
        
        for(int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }
        
        int temp = -1;
        for(int i = 0; i < index.length; i++) {
            if(temp < index[i]) {
                temp = index[i];
                answer = i;
            } else if(temp == index[i])
                answer = -1;
        }
        
        
        return answer;
    }
}
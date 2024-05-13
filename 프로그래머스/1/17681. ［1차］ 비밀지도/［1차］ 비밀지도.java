class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        for (int i = 0; i < arr1.length; i++) {
            str1[i] = String.format("%0" + n +"d", Long.parseLong(Long.toBinaryString(arr1[i])));
            str2[i] = String.format("%0" + n +"d", Long.parseLong(Long.toBinaryString(arr2[i])));
        }

        for (int i = 0; i < str1.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] strSplit1 = str1[i].split("");
            String[] strSplit2 = str2[i].split("");
            for (int j = 0; j < strSplit1.length; j++) {
                if(strSplit1[j].equals("0") && strSplit2[j].equals("0")) {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
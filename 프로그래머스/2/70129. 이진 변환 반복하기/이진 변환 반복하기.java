class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while (true){
            int oldLength = s.length();
            s= s.replaceAll("0","");
            int newLength = s.length();
            answer[1] += oldLength-newLength;
            answer[0] ++;
            if(s.equals("1"))return answer;
            s = Integer.toBinaryString(newLength);
        }
    }
}
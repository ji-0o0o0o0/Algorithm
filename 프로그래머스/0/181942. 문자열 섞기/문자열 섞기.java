class Solution {
    public String solution(String str1, String str2) {
       StringBuilder answer = new StringBuilder();
            //for문
            for (int i = 0; i <str1.length() ; i++) {
                //번갈아가면서 문자열 만들어준다
                answer.append(str1.charAt(i));
                answer.append(str2.charAt(i));
            }
            return answer.toString();
    }
}
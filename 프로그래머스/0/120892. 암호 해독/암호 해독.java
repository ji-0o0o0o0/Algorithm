class Solution {
    public String solution(String cipher, int code) {
        //분석
        //암호화된 문자열 cipher이 주어질때 code의 배수 번째 글자만 진짜 암호
        //규칙
        //code 번째 문자만 출력
        //코딩화
        StringBuilder answer = new StringBuilder();
        for (int i = code-1; i <cipher.length() ; i+=code) {
            answer.append(cipher.charAt(i));
        }
        return answer.toString();
    }
}
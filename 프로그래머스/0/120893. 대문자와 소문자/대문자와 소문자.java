class Solution {
    public String solution(String my_string) {
        //분석
        //대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return
        //규칙
        //대문자인지 소문자인지 확인해서 리턴
        //코딩화
        StringBuilder answer = new StringBuilder();
        for (char ch : my_string.toCharArray()) {
            String s = String.valueOf(ch);
            answer.append(Character.isUpperCase(ch) ? s.toLowerCase() : s.toUpperCase());
        }
        return answer.toString();
    }
}
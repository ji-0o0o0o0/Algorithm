class Solution {
    public String solution(String my_string) {
            //분석
            //my_string에서 모음을 제거한 문자열을 return
            //규칙
            //a, e, i, o, u 중에 겹치는거 빼고 글자를 더해주면 될듯?
            //코딩화
            //1. 모음 문자열을 만든다
            String vowel = "aeiou";
            StringBuilder answer = new StringBuilder();
            for(char c: my_string.toCharArray()){
                if(!vowel.contains(String.valueOf(c))){//모음이 포함하지 않으면 answer에 추가
                    answer.append(c);
                }
            }
            return answer.toString();
        }
}
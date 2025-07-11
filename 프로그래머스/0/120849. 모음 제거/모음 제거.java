class Solution {
    public String solution(String my_string) {
            //분석
            //my_string에서 모음을 제거한 문자열을 return
            //규칙
            //a, e, i, o, u 중에 겹치는거 빼고 글자를 더해주면 될듯?
            //코딩화
            //정규화를 이용해서 모음을 빈값으로 대체한다.
            return my_string.replaceAll("[aeiou]", "");
        }
}
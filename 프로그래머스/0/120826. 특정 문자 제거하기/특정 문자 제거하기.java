class Solution {
    public String solution(String my_string, String letter) {
            //분석
            //my_string에서 letter를 제거한 문자열을 return
            //규칙
            //letter에 들어있는 단어를 빈칸으로 replaceAll
            return my_string.replaceAll(letter,"");
        }
}
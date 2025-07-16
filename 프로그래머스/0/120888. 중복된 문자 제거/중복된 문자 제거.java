class Solution {
    public String solution(String my_string) {
        //분석
        //my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return
        //규칙
        //마지막부터 값 비교해서 있으면 제거하기
        //코딩화
        StringBuilder answer = new StringBuilder();
        //1. my_String을 뒤부터 확인해서 있으면 answer에 안넣는다.
        for (int i = 0; i <my_string.length(); i++) {
            char ch = my_string.charAt(i);
            //포함여부 확인해서 포함안되어있으면 추가
            if(answer.length()-answer.toString().replace(""+ch,"").length()<1){
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
class Solution {
    public String solution(String my_string, int n) {
        //분석
        //my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 
        //규칙
        //my_string문자열에 있는 문자를 n 개씩 곱해준다
        //코딩화
        //1. StringBuilder 선언
        StringBuilder answer = new StringBuilder();
        //2. foreach 이용해서 StringBuilder에 char형식으로 n개씩 넣어준다
        for(char str : my_string.toCharArray()){
            answer.append((str+"").repeat(n));
        }
        
        return answer.toString();
    }
}
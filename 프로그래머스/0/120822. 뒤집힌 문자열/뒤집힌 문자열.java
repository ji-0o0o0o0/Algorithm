class Solution {
    public String solution(String my_string) {
        //분석
            //my_string을 거꾸로 뒤집은 문자열을 return

            //규칙
            // char 형식으로 바꿔서 하나씩 역순 시키면 되려나?

            //코딩화
            //1. StringBuilder 에 값을 넣어준다
             StringBuilder answer = new StringBuilder();
            answer.append(my_string);
            //2. 역순 시킨다
            answer.reverse();
            return answer.toString();
    }
}
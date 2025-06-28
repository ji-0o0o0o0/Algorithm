class Solution {
    public String solution(String my_string) {
        //분석
            //my_string을 거꾸로 뒤집은 문자열을 return

            //규칙
            // char 형식으로 바꿔서 하나씩 역순 시키면 되려나?

            //코딩화
            //1, 역순 시킨다.
            StringBuilder answer = new StringBuilder();
            for (int i = my_string.length()-1; i >=0 ; i--) {
                answer.append(my_string.charAt(i));
            }
            return answer.toString();
    }
}
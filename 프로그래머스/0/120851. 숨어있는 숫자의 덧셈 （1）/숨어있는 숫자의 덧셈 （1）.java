class Solution {
    public int solution(String my_string) {
            //분석
            //my_string안의 모든 자연수들의 합을 return
            //규칙
            //숫자가 아닌 값들 ""으로 replace 한 후 남은 값 더하기
            //코딩화
            //숫자만 남기기
            my_string = my_string.replaceAll("[a-zA-Z]","");
            int answer = 0;
            //하나씩 더해주기
            for(char c : my_string.toCharArray()) {
                answer+=(c-'0');
            }
            return answer;
        }
}
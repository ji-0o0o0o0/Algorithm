class Solution {
    public String[] solution(String my_str, int n) {
            /*
            * 문제
            * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return
            * 규칙
            * 1. my_str/n 의 갯수로 저장할 문자열 배열을 만들어준다
            * 2, 만든 문자열 배열에 n 개씩 잘라서 넣어준다.
            * */
            String[] answer = new String[my_str.length()/n+((my_str.length()%n==0)?0:1)];
            for (int i = 0; i <answer.length ; i++) {
                answer[i]=my_str.substring(i*n, Math.min((i * n + n), my_str.length()));
            }
            return answer;
        }
}
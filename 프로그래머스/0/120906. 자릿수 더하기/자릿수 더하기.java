class Solution {
    public int solution(int n) {
            /*
            * 분석
            * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return
            * 규칙
            * n 값을 String 값으로 변경 후 각 자리를 모두 더해서 리턴해준다
            * */
            String str =n+"";
            int answer = 0;
            for(String s:str.split("")){
                answer+=Integer.parseInt(s);
            }
           
            return answer;
        }
}
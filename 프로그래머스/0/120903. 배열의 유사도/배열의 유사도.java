class Solution {
    public int solution(String[] s1, String[] s2) {
            /*
            * 분석
            * 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return
            * 규칙
            * s1 과  s2 비교해서 같은 수 만큼 리턴
            * */
            int answer = 0;
            for(String ss1: s1){
                for(String ss2: s2){
                    if(ss1.equals(ss2)){
                        answer++;
                    }
                }
            }
            return answer;
        }
}
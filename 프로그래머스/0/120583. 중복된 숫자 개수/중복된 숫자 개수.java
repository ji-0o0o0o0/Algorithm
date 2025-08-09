class Solution {
    public int solution(int[] array, int n) {
            /*
            * 문제
            * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return
            * 규칙
            * array 안에 n 이 몇개 있는지 확인
            * */
            int answer = 0;
            for(int i : array){
                answer+=i==n?1:0;
            }
            return answer;
        }
}
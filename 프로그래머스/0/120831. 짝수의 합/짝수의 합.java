class Solution {
    public int solution(int n) {
            //분석
            //정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return
            //규칙
            // n 이하 짝수 모두 더하기
            //코딩회
            //1. n 인지 확인
            //2. for 문으로 짝수일때 sum에 더해준다.
            int sum=0;
            for(int i =2; i<=n; i+=2){
                sum+=i;
            }
            return sum;
        }
}
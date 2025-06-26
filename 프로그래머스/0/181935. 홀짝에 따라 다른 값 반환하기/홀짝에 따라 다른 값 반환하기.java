class Solution {
    public int solution(int n) {
            //분석
            //양의 정수 n
            // n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return
            // n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
            //분석
            // 홀수 n%2!=0 -> n 이하의 홀수 합
            // 짝수 n%2==0 -> n 이하의 짝수 제곱의 합

            //코딩화
            int ans = 0;
            //for 문으로 n이하의 값들 반복해준다
            for (int i = n; i >0; i--) {
                if ((n%2==0)&&(i % 2 == 0)) {//짝수
                    //짝수의 값 곱하기
                    ans+= (int)Math.pow(i,2);
                } else if ((n%2!=0)&&(i % 2 != 0)) {//홀수
                    //홀수값 더하기
                    ans+=i;
                }
            }
            return ans;
        }
}
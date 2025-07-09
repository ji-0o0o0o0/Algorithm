class Solution {
   public int solution(int n) {
            //분석
            //약수의 개수가 세 개 이상인 수를 합성수
            //자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return
            //규칙
            //n 이하 값의 약수를 확인해서 약수가 3개 이상일 때 카운트
            //코딩화
            //1. cnt값 초기화
            int cnt = 0;
            //2. for 문으로 n 이하의 값 확인
            for (int i = n; i >0 ; i--) {
                //3. 약수를 구해서 cnt 에 추가한다.
                int divisionCnt =0;
                for (int j = 1; j <=i ; j++) {
                    if(i%j==0){
                        divisionCnt++;
                        if(divisionCnt>=3){
                            cnt++;
                            break;
                        }
                    }
                }
            }
            return cnt;
        }
}
class Solution {
     public int solution(int n, int t) {
            /*
            * 분석
            * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return
            * 규칙
            * n의 t제곱 해서 리턴 하는 문제
            * n을 t 번 곱하거나, Math.pow(값, 지수) 이용
            * */
            while (t>0){
                n*=2;
                t--;
            }
            return n;
        }
}
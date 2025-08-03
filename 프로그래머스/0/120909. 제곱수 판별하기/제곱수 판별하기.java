class Solution {
    public int solution(int n) {
            /*
            *  분석
            * n이 제곱수라면 1을 아니라면 2를 return
            * 규칙
            * Math.sqrt(n) 이용하여 n 이 제곱수인지 판별
            * */
            double sqrt = Math.sqrt(n);
            return sqrt==(int)sqrt?1:2;
        }
}
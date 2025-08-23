class Solution {
    public int solution(int[] num_list) {
            /*
            * 문제
            * 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return
            * 규칙
            * 1. num_list 의 합의 제곱, 곱을 구한다.
            * 2. 합의제곱이 크면 0. 곱이 크면 1을 리턴
            * */
            int sum = 0;
            int square = 1;
            for(int i : num_list ){
                sum += i;
                square *=i;
            }
            return (Math.pow(sum,2)>square)?1:0;
        }
}
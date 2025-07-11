class Solution {
    public int solution(int n) {
            //분석
            //팩토리얼을 걸었을때 n 값이 출력되는 값이 뭔지 확인하는 문제
            //규칙
            //1부터 곱해서 n이랑 같으면 리턴해주면 된다.
            //코딩화
            //1.for 문을 제한을 두지 않고 1부터 곱해서 n이랑 같으면 리턴
            int answer = 1;
            for(int i = 1;;i++){
                answer*=i;
                if(answer == n){//같으면 리턴
                    return i;
                } else if (answer>n) {//n 이하의 최대 팩토리얼 리턴
                    return i-1;
                }
            }
        }
}
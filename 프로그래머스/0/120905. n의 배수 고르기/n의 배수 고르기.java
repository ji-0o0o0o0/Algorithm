class Solution {
    public int[] solution(int n, int[] numlist) {
            /*
            * 분석
            * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return
            * 규칙
            * n의 배수 값들만 리턴하면 된다.
            * */
            int cnt = 0;
            for (int i = 0; i <numlist.length ; i++) {
                //n으 배수가 아닌것은 0을 대입
                int num =numlist[i]; 
                if(num%n!=0){
                    numlist[i]=0;
                }else {
                    cnt++;
                }
            }
            int[] answer = new int[cnt];
            int answerCnt = 0;
            for (int j : numlist){
                //j가 0 이 아닌건 answer에 넣어준다
                if(j!=0){
                    answer[answerCnt++]=j;
                }
            }
            return answer;
        }
}
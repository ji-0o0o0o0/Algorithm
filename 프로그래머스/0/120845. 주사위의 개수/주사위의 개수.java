class Solution {
   public int solution(int[] box, int n) {
            //분석
            //직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다.
            //상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
            // 상자에 들어갈 수 있는 주사위의 최대 개수를 return
            //규칙
            //가로, 세로, 높이 각각 모서리가 n인 정육만체 몇 개 들어가는지 확인
            //가로, 세로, 높이에  n 으로 나눈 값을 구해서 모두 곱해주면 될거같다

            //코딩화
            //1. 결과 값 넣을 answer 초기화
            int answer = 1;
            //2. box 각 n이 몇번 들어갈 수 있는지 확인 후 answer에 곱해준다.
            for(int line:box){
                answer*= (int) ((double) line /n);
            }
            return answer;
        }
}
class Solution {
    public int[][] solution(int[] num_list, int n) {
            //분석
            //정수 배열 num_list와 정수 n
            //num_list안에서 n 개씩 묶어서 2차원 배열로 만들기
            //규칙

            // 2차원 배열을 초기화 시켜 준다.
            int[][] answer = new int[num_list.length/n][n];
            for (int i = 0; i <num_list.length ; i++) {
                answer[i / n][i % n] = num_list[i];
            }

            return answer;
        }
}
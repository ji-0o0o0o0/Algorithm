class Solution {
     public int[] solution(int start_num, int end_num) {
            /*
            * 문제
            * start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return
            * */
            int[] answer = new int[end_num-start_num+1];
            for (int i = start_num, j =0; i <=end_num ; i++,j++) {
                answer[j]=i;
            }
            return answer;
        }
}
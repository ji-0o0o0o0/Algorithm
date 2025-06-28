class Solution {
    public int[] solution(int[] num_list) {
                    //분석
            //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return

            //규픽
            //Arrays.sort 를 이용하여 배영을 역순 시킨다.

            //코딩화
            //1, 역순 시킨다.
            int[] answer = new int[num_list.length];
            for (int i = 0; i <num_list.length ; i++) {
                answer[i]=num_list[num_list.length-i-1];
            }
            return answer;
    }
}
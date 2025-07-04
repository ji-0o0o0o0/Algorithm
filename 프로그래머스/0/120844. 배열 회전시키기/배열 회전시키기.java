class Solution {
    public int[] solution(int[] numbers, String direction) {
            //분석
            //정수가 담긴 배열 numbers와 문자열 direction
            //배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return
            //규칙
            //direction 이 "left"면 왼쪽으로 한칸씩 이동 후 맨 앞에 숫자가 맨뒤로 이동
            //direction 이 "right"면 오른쪽으로 한칸씩 이동 후 맨 뒤에 숫자가 맨앞로 이동

            //코딩화
            //answer 값 초기화
            int n = numbers.length;
            int[] answer = new int[n];

            for (int j = 0; j <n ; j++) {
                if(direction.equals("right")){
                    answer[(j+1)%n]=numbers[j];
                }else {
                    answer[(j-1+n)%n]=numbers[j];

                }
            }
            return answer;
        }
}
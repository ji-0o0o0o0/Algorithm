class Solution {
     public int[] solution(int[] numbers, int num1, int num2) {
            //분석
            // 정수 배열 numbers와 정수 num1, num2
            // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return
            //규칙
            //numbers[num1]~numbers[num2]까지 나오게 하면 됨
            //코딩화
            
            int[] answer = new int[num2-num1+1];
            int idx =0;
            for (int i = 0; i <numbers.length ; i++) {
                if(i<num1 || i>num2){
                    continue;
                }else {
                    answer[idx++]=numbers[i];
                }

            }

            return answer;
        }
}
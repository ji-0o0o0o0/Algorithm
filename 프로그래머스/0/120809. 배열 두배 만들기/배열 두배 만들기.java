class Solution {
    public int[] solution(int[] numbers) {
        //분석
        //정수 배열 numbers, numbers의 각 원소에 두배한 원소를 가진 배열을 return

        //규칙
        //numbers 배열을 반복문을 통해 2배씩 곱해준다.

        //코딩화
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] *=2;
        }
        return numbers;
    }
}
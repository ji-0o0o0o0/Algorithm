class Solution {
    public int solution(int[] numbers) {
            /*
            * 문제
            * 정수 배열 numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
            * 규칙
            * 1. 첫번째와 두번째를 곱해서 max 값 으로 지정
            * 2. 이중 for 문으로 곱을 진행해서 max 보다 크면 max 에 넣어준다.
            * 3. 반복 후 최종 값을 리턴
            * */
            int max = numbers[0]*numbers[1];
            for (int i = 0; i <numbers.length ; i++) {
                for (int j = i; j <numbers.length ; j++) {
                    if(i==j)continue;
                    max = Math.max(numbers[i] * numbers[j], max);
                }
            }
            return max;
        }
}
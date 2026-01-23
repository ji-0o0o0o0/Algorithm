import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
         /*문제
        * 정수 배열 numbers 에서 다른 인뎃스에 있는 2개의 수 뽑아 더해 만들 수 있는 모든 수를 벼열에 오름차순으로 담아 반환*/
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(answer.contains(numbers[i]+numbers[j])){continue;}
                answer.add(numbers[i]+numbers[j]);
            }
        }

        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.Arrays;
import java.util.OptionalInt;

class Solution {
   public int[] solution(int[] array) {
            /*
            * 분석
            * 가장 큰 수와 그 수의 인덱스를 담은 배열을 return
            * 규칙
            * 가장 큰 수를 찾고 그 큰수의 인덱스를 배열아 담아서 리턴하면 된다
            */
            // 가장 큰수를 구한다
            OptionalInt maxInt= Arrays.stream(array).max();
            int[] answer = new int[]{maxInt.getAsInt(),0};
            //가장 큰 값의 인덱스를 찾아준다
            for (int i = 0; i <array.length ; i++) {
                if(array[i]==maxInt.getAsInt()){
                    answer[1]=i;
                    break;
                }
            }
            return answer;
        }
}
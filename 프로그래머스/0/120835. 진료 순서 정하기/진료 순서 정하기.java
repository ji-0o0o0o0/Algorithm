import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
            //분석
            //응급실에 온 환자의 응급도를 기준으로 진료 순서를 정리
            // 정수 배열 emergency
            // 응급도가 높은 순서대로 진료 순서를 정한 배열을 return
            //규칙
            // 먼저 정렬 후 몇번째 일치하는지 배열에 담아주면 되지않을까?
            //코딩화
            //1. 내림 차순 정렬
            // Step 1: int[] → Integer[]
            Integer[] boxed = Arrays.stream(emergency)// IntStream 생성
                    .boxed() // int → Integer (박싱)
                    .toArray(Integer[]::new);// Integer[]로 변환

            // Step 2: 내림차순 정렬
            Arrays.sort(boxed, Collections.reverseOrder());

            //2.순서를 넣어줄 int[] 을 생성
            int[] result = new int[emergency.length];
            int cnt =0;
            //3. for 문으로 emergency랑 boxed를 비교해서 boxed 순서에 맞게 result 배열에 넣어준다.
            for (int i = 0; i <emergency.length ; i++) {
                for (int j = 0; j <boxed.length ; j++) {
                    if(emergency[i]==boxed[j]){
                        result[cnt++]=j+1;
                        continue;
                    }
                }
            }
            return result;
        }
}
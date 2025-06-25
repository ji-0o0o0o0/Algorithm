import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        //분석
        //정수 배열 array가 매개변수로 주어질 때, 중앙값을 return

        //규칙
        //정렬을 해서 가운데 값을 가져오면 된다

        //코드화
        //1. 정렬
        Arrays.sort(array);
        //2. 가운데 값을 가져온다
        int idx = array.length/2;
        
        return array[idx];
    }
}
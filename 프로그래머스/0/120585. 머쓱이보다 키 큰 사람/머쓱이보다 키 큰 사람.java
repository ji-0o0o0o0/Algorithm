import java.util.*;
class Solution {
     public int solution(int[] array, int height) {
            /*
            * 문제
            *  키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return
            * 규칙
            * array안에 height 를 넣은 후 정렬해서 height 가 몇번째 들어있는지 확인한다.
            * */
            int[] checkHeight = Arrays.copyOf(array,array.length+1);
            checkHeight[array.length]=height;

            //정렬
            Arrays.sort(checkHeight);

            int bigHeightCnt=0;

            for (int j : checkHeight) {
                if (j > height) {
                    bigHeightCnt++;
                }
            }
            return bigHeightCnt;
        }
}
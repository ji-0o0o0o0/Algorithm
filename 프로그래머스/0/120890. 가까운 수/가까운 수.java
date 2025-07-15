import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
            //분석
            //정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return
            //규칙
            //array 중에서 n과 가장 가까운 숫자 리턴
            //코딩화
            //1. array 오름차순 정렬을 한다.
            Arrays.sort(array);
            //2. 첫번째와 비교한 값을 넣어준다.
            int ans = array[0]>n?array[0]-n:n-array[0];
            int closest = array[0];
            for (int i = 1; i < array.length ; i++) {
                //3. ans 보다 작으면 ans에 값을 넣어준다.
                int tmp = array[i]>n?array[i]-n:n-array[i];
                if(tmp<ans){
                    ans = tmp;
                    closest = array[i];
                }else if(tmp==ans && array[i] < closest){
                    closest = array[i];
                }
            }
            return closest;
        }
}
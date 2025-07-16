import java.util.*;
class Solution {
    public int solution(int[] sides) {
        //분석
        //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 할때,
        //세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return
        //규칙
        //오름차순 정렬한 후 첫번째, 두번째 더한 길이가 세번째 길이보다 작으면 1, 아니면 2
        //코딩화
        //오름차순 정렬
        Arrays.sort(sides);
        //길이비교 후 삼각형 만들 수 있으면 1, 아니면 2
        return (sides[0]+sides[1])<=sides[2]?2:1;
    }
}
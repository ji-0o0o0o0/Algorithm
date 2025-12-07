import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] sides) {
        /*
        * 삼각형의 완성조건
        * - 문제
        * 1. 가장 긴 변 < 다른 두 변의 길이의 합
        * 2. sides에 2변의 길이가 주어짐
        * 3. 나머지 한변이 될 수 있는 정수 갯수 리턴
        * - 풀이
        * 0. 중복 있으면 안되니 set 이용
        * 1. sides에 가장 긴변이 있을 경우
        * 2. 나머지 한 변이 가장 긴 변이 있을 경우
        * */
        int a = Math.min(sides[0], sides[1]);
        int b = Math.max(sides[0], sides[1]);

        Set<Integer> set = new HashSet<>();

        // 경우 1: b가 가장 긴 변 (b - a < c <= b)
        for (int c = b - a + 1; c <= b; c++) {
            set.add(c);
        }

        // 경우 2: c가 가장 긴 변 (b < c < a + b)
        for (int c = b + 1; c < a + b; c++) {
            set.add(c);
        }

        return set.size();
    }
}
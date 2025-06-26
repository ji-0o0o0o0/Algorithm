class Solution {
   public int solution(String ineq, String eq, int n, int m) {
            //분석
            //두 수가 n과 m이라면
            //">", "=" : n >= m
            //"<", "=" : n <= m
            //">", "!" : n > m
            //"<", "!" : n < m
            //두 문자열 ineq와 eq
            // ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나
            //  두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
            //규칙
            // ineq, eq 값 가져와서 nm 비교하면 됨
            // true -> 1 , flase -> 0

            //코딩화
            //switch 로 값 ineq, eq 값 확인 후 비교하기
            boolean result = switch (ineq + eq) {
                case ">=" -> n >= m;
                case "<=" -> n <= m;
                case ">!" -> n > m;
                case "<!" -> n < m;
                default -> false;
            };
            return result?1:0;
        }
}
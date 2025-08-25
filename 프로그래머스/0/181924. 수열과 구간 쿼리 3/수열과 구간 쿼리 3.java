class Solution {
    public int[] solution(int[] arr, int[][] queries) {
            /*
            * 문제
            * query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
            * 규칙
            * tmp 값 만들어서 하면 될듯?
            * */
            int tmp = 0;
            for (int[] query : queries) {
                //arr[i] 값을 tmp 값에 넣어준다
                tmp = arr[query[0]];
                //arr[i]에 arr[j]를 넣어준다
                arr[query[0]] = arr[query[1]];
                //arr[j] 에 tmp 값을 넣어준다.
                arr[query[1]] = tmp;
            }
            return arr;
        }
}
class Solution {
     public int solution(int[] array) {
            /*
            * 문제
            * 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return
            * 규칙
            * array 배열 돌면서 7의 갯수 cnt
            * */
            //7 갯수 카운트 변수 생성
            int sevenCnt = 0;
            //배열 반복문으로 확인
            for(int i: array){
                char[] chars = (i+"").toCharArray();
                for (char aChar : chars) {
                    sevenCnt += aChar == '7' ? 1 : 0;
                }
            }
            return sevenCnt;
        }
}
class Solution {
    public int solution(int[] dot) {
            //분석
            // x,y 좌표에 찍었을때 어느 사분면에 속하는지 리턴
            //규칙
            // 양수, 양수 -> 1
            // 음수, 양수 -> 2
            // 음수, 음수 -> 3
            // 양수, 음수 -> 4

            //코딩화
            //x 좌표 양수일때
            if(dot[0]>=0){
                return dot[1]<0?4:1;
            }else {
                //x 죄표 음수 일때
                return dot[1]<0?3:2;
            }

        }
}
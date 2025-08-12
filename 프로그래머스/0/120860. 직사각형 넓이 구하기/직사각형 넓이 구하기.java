class Solution {
    public int solution(int[][] dots) {
            /*
            * 문제
            * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return
            * 규칙
            * x좌표가 같은 인덱스를 찾아 y값 끼리 빼고 y좌쵸가 가튼 d인데ㄱ스를 찾아 x 좌표 끼리 빼준다.
            * */
            int xValue = dots[0][0];
            int yValue = dots[0][1];
            int extent = 1;
            for (int i = 1; i <dots.length ; i++) {
                if(dots[i][0]==xValue){
                    extent*=(yValue-dots[i][1]);
                }
                if(dots[i][1]==yValue){
                    extent*=(xValue-dots[i][0]);
                }
            }
            return Math.abs(extent);
        }
}
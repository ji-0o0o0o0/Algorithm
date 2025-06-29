class Solution {
     public int solution(int angle) {
            //분석
            //angle 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return
            //규칙
            // angle에 조건문 걸어서 ㄱㄱ
            //코딩화
            //1. if문을 조건걸엊ㅁ
            if( 0 < angle && angle < 90){
                return 1;
            }else if( angle == 90){
                return 2;
            } else if ( 90 < angle && angle < 180) {
                return  3;
            } else {
                return 4;
            }
        }
}
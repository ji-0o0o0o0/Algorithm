class Solution {
     public int solution(int price) {
            //분석
            // 10만 원 이상 사면 5%,
            // 30만 원 이상 사면 10%,
            // 50만 원 이상 사면 20%를 할인
            //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return

            //규칙
            //가격에 따라서 할인율 적용하면 될듯?

            //코딩화
            // 큰 가격부터 비교하기(50->30->10)
            return (int) (price>=500000?price*0.8:(price>=300000?price*0.9:price>=100000?price*0.95:price));
        }
}
class Solution {
    public int[] solution(int money) {
            //분석
            // 아이스 아메리카노는 한잔에 5,500원
            // 가지고 있는 돈 = money
            // 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return

            //규칙
            // 최대로 마실 수 있는 커피 : money/5500, 남은돈: money-(5500*money/5500)
            // 순서대로 int 배열에 넣기

            //코딩화
            //1. 최대로 마실 수 있는 커피를 구한다
            int coffee = money/5500;
            //2. 남은 돈을 구한다.
            int lastMoney = (money>=5500)?money-coffee*5500:money;
            //3, 배열에 넣어준다.
            int[] answer = {coffee,lastMoney};
            return answer;
    }
}
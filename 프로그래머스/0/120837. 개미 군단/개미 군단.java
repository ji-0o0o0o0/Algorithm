class Solution {
   //분석
    //개미 군단 병력 정리
    //장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력
    // 예를 들어 체력 23의 여치를 사냥하려고 할 때, 장군개미 네 마리 + 병정개미 한 마리
    // 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return
    //규칙
    // 나누기와 너머지를 적절히 적용하면 될듯?
    //코딩화
    public int solution(int hp) {
        //1. 각 공격력을 배열에 넣어준다,
        int[] totalHp = new int[]{5,3,1};
        int antStrengths =0;
        for(int power : totalHp){
            //2. 각 전력이 배치된 개미(hp/power)는 antStrengths에 넣어준다.
            antStrengths += hp/power;
            //3, 전력에 배치된 개비 빼고 남은 hp를 재정의 한다.
            hp%=power;
        }
        return antStrengths;
    }
}
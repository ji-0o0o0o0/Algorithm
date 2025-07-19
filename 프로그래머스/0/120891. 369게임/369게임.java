class Solution {
    public int solution(int order) {
        //분석
        // 3, 6, 9가 들어가는 숫자가 몇개인지 확인하면 될듯
        //규칙
        //order를 String으로 만들어서 하나씩 비교
        //3,6,9면 answer에 1씩 더한다.
        //코딩화
        //1. order을 문자열로 변경
        String orders = order + "";
        int answer = 0;
        for (int i = 0; i <orders.length() ; i++) {
            char ch = orders.charAt(i);
            //3으로 나눠지면 answer +1
           if (ch == '3' || ch == '6' || ch == '9'){answer++;}
        }
        return answer;
    }
}
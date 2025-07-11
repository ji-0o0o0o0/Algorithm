class Solution {
     public String solution(String rsp) {
            //분석
            //가위는 2 바위는 0 보는 5
            // 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
            // rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return

            //규칙
            //이기는 게임을 해야함
            //2->0, 0->5, 5->2

            //코딩화
            //StringBuilder 선언 및 초기화
            StringBuilder answer = new StringBuilder();
            //rsp 값 하나씩 꺼내와서 2->0, 0->5, 5->2 를 StringBuilder에 넣는다.
            for(char str : rsp.toCharArray()){
                answer.append(str=='2'?"0":(str=='0'?"5":"2"));
            }
            return answer.toString();
        }
}
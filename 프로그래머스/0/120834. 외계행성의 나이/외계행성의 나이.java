class Solution {
    public String solution(int age) {
        //분석
            //PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
            // a는 0, b는 1, c는 2, ..., j는 9입니다.
            // 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
            // 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return
            //규칙
            //a는 0, b는 1, c는 2, ..., j는 9 로 변환해서 리턴

            //코딩화
            // age 를 문자화
            StringBuilder answer = new StringBuilder();
            for (char str: (age+"").toCharArray()){
                //a는 97이므로 '1'인 49에 49을 더해서 문자에 더해준다.
                int ages = str+49;
                answer.append((char) ages);
            }
            // 숫자에 매칭되는 문자 리턴
            //for 문으로 하나씩 확이 후

            return answer.toString();
    }
}
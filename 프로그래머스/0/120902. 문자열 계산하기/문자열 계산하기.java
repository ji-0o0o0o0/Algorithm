class Solution {
     public int solution(String my_string) {
            /*
            * 분석
            * 수식을 계산한 값을 return
            * 연산자는 +,- 만 존재
            * 규칙
            * contains 이용하면 되지않을까?
            * */

            String[] strings = my_string.split(" ");
            int answer = Integer.parseInt(strings[0]);
            for (int i = 0; i <strings.length ; i++) {
                if(strings[i].equals("+")){
                    answer=answer+Integer.parseInt(strings[i+1]);
                }else if(strings[i].equals("-")){
                    answer=  answer-Integer.parseInt(strings[i+1]);
                }
            }
            return answer;
        }
}
class Solution {
     public String[] solution(String[] quiz) {
            /*
            * 분석
            * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return
            * 규칙
            * 1. quiz 길이에 맞는 String 배열을 만들어준다.
            * 2. quiz 배열 안에서 수식에 맞게 계산 하도록 한 번 더 split(" ")을 통해 배열을 만들어준다.
            * 3. 그 수식이 맞는지 확인 후 수식이 옳다면 "O"를 틀리다면 "X"
            * */

            String[] answer =  new String[quiz.length];
            String[] expression =null;
            for (int i = 0; i < quiz.length ; i++) {
                expression = quiz[i].split(" ");

                boolean result = false;
                if(expression[1].equals("+")){
                    result = (Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]))==Integer.parseInt(expression[4]);
                }else{
                    result = (Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]))==Integer.parseInt(expression[4]);
                }
                answer[i]=result?"O":"X";
            }
            return answer;
        }
}
class Solution {
     public String solution(int[] numLog) {
            /*
            * 문제
            * numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받움
            * "w" : 수에 1을 더한다.
              "s" : 수에 1을 뺀다.
              "d" : 수에 10을 더한다.
              "a" : 수에 10을 뺀다.
            * numLog에 대해 조작을 위해 입력받은 문자열을 return
            * */
            StringBuilder answer = new StringBuilder();
            for (int i = 1; i <numLog.length ; i++) {
                int result = numLog[i]-numLog[i-1];
                answer.append(switch (result) {
                    case 1 -> "w";
                    case -1 -> "s";
                    case 10 -> "d";
                    case -10 -> "a";
                    default -> "";
                });
            }

            return answer.toString();
        }
}
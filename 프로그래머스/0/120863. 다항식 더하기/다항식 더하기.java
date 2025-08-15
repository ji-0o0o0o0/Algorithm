class Solution {
    public String solution(String polynomial) {
            /*
            * 문제
            *  덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return
            * 규칙
            * 1. polynomial 을 String 배열로 만든다
            * 2. 배열을 하나씩 돌면서 x가 xsum 에 더해주고, 포함하지 않으면 sum 에 더해준다.
            * 3. 최종 값을 더해준다
            * */
            int xSum = 0;
            int sum = 0;
            String[] strings = polynomial.split(" ");
            for(String s : strings){
                if(s.equals("+"))continue;
                if(s.contains("x")){
                    String x = s.replace("x","");
                    int xNum = Integer.parseInt(x.isEmpty() ?"1":x);
                    xSum+=xNum;
                }else {
                    sum+=Integer.parseInt(s);
                }
            }

            String xResult = xSum==1?"x":(xSum==0)?"":xSum+"x";
            String numResult = sum==0?"":(xSum==0?""+sum:" + "+sum);
            return xResult+numResult;
        }
}
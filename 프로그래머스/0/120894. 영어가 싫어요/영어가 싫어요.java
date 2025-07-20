class Solution {
    public long solution(String numbers) {
            //분석
            //문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return
            //규칙
            //numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 을 숫자로 변경하면 됨
            //replaceAll을 사용하면 될거같음
            //코딩화
            //1. 변경해야하는 문자열을 배열로 만들어준다
            String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            long answer = 0;
            for (int i = 0; i <str.length ; i++) {
                if(numbers.contains(str[i])){
                    //포홤되는 문자에 맞는 숫자를 대체시켜준다.
                    numbers=numbers.replaceAll(str[i],i+"");
                }
            }
            //Long 타입으로 변경
            return Long.parseLong(numbers);
        }
}
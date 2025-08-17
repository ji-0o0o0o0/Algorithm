class Solution {
    public int solution(String my_string) {
            /*
            * 문제
            * my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return
            * 규칙
            * my_string에 있는 글자를 하나씩 확인해보자!
            * 만약 다음 수가 숫자면 지금 더하지 않고 다음에 더하기
            * 숫자 판단은 아스키코드로 판단(48~57)
            * */
            StringBuilder Num= new StringBuilder();
            int answer=0;
            for (int i = 0; i <my_string.length() ; i++) {

                char currentC = my_string.charAt(i);

                //1. 지금 문자가 숫자
                //1-1. 다음 문자가 숫자
                // 더하기 보류

                //1-2. 디음 문자가 숫자가 아님
                //바로 더함

                if(currentC>=48&&currentC<=57) {
                    if (i < my_string.length() - 1 && my_string.charAt(i+1) >= 48 && my_string.charAt(i+1) <= 57) {
                        Num.append(currentC);
                    } else {
                        answer += Num.length() == 0 ? currentC - '0' : Integer.parseInt((Num.append(currentC).toString()));
                        Num = new StringBuilder();
                    }
                }
            }
            return answer;
        }
}
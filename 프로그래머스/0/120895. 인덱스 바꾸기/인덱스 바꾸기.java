class Solution {
    public String solution(String my_string, int num1, int num2) {
            /*
            * 분석
            * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return
            * 규칙
            * index 확인하는 문제같아
            * index확인해서 num1자리와 num2 자리 바꾸기
            * tmp 이용해서 풀면될듯?
            * */

            //배열로 변환
            char[] chars = my_string.toCharArray();
            //tmp을 이용하여 자리를 바꾼다.
            char tmp = chars[num1];
            chars[num1]=chars[num2];
            chars[num2]=tmp;
            //배열을 문자열로 다시 변환 하여 리턴
            return String.valueOf(chars);
        }
}
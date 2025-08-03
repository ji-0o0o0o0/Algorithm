class Solution {
    public int solution(String str1, String str2) {
            /*
            * 분석
            * 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return
            * 규칙
            * str1에 str2가 포함되어있는지 확인하면 됨
            * */
            return str1.contains(str2)?1:2;
        }
}
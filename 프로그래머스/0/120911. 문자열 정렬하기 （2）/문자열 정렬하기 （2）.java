import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
            /*
            * 분석
            * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return
            * 규칙
            * my_string을 소문자로 변경 후 정렬
             * */
            my_string = my_string.toLowerCase();
            String[] str =my_string.split("");
            //정렬
            Arrays.sort(str);
            return String.join("",str);
        }
}
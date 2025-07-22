import java.util.*;
class Solution {
      public String solution(String s) {
            /*
            * 분석
            * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return(한번만 등장하는 문자가 없을 경우 빈 문자 return)
            * 규칙
            * 한번만 등장하는 문자만 남아야하니까 중복되는 문자는 지우면 되지 않을까?
            * */
            //1. s 를 하나씩 확인해서 indexOf로 몇개가 있는지 확인
            String answer = s;
            for(String str : s.split("")){
               int duplicationCnt = s.length()-s.replaceAll(str,"").length();
               //중복되는 값이 1개 초과되면 빈값으로 대체
                answer = duplicationCnt>1? answer.replaceAll(str,""):answer;
            }
            //정렬
            char[] charArr = answer.toCharArray(); // String to Char Array
            Arrays.sort(charArr); // Char Array 알파벳 순 정렬
            return String.valueOf(charArr);
        }
}
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
            //분석
            //my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return
            //규칙
            //아스키 코드 이용해서 숫자를 걸러낸다. (80~89)

            //코딩화
            //1. my_string에서 숫자만 출력
            StringBuilder builder = new StringBuilder();
            for(char i : my_string.toCharArray()){
                if(48<=i && i<59){
                    builder.append(i);
                }
            }

            //answer에 숫자 배열로 넣어주고 오른차순으로 정렬
            int[] answer = new int[builder.length()];
            String[] result = builder.toString().split("");
            int idx=0;
            for(String i : result){
                answer[idx++] = Integer.parseInt(i);
            }

            Arrays.sort(answer);
            return answer;
        }
}
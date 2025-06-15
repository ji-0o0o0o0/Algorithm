class Solution {
    public String solution(String[] arr) {
       //1. 문제분석
            // 문자들이 담겨있는 배열 arr를 붙여서 return 
            // arr = ["a","b","c"] -> abc return

            //2. 규칙찾기
            //반복문을 이용하여 이어서 나오게 하면 된다. 

            //3. 코딩화
            StringBuilder answer = new StringBuilder();
            for(String a : arr){
                answer.append(a);
            }
            return answer.toString();
    }
}
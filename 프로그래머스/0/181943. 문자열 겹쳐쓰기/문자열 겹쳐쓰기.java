
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
       
        // answer 값 초기화
        StringBuilder answer = new StringBuilder();

        // 이중 for 문으로?
        for (int i = 0; i <my_string.length() ; i++) {
            // my_string의 s인덱스 만큼 나오게 한다.
            if(i < s || i>=overwrite_string.length()+s){
                answer.append(my_string.charAt(i));
            } else if(i<overwrite_string.length()+s) {
                // 그 뒤에 overwrote_string 값 나오게 한다.
                answer.append(overwrite_string);
                i+=overwrite_string.length()-1;
            }
        }

        //answer 출력
        return answer.toString();
    }
}
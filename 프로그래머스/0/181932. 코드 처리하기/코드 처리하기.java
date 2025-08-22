class Solution {
       public String solution(String code) {
            /*
            * 문제
            * code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿈
            * mode에 따라 code를 읽어가면서 문자열 ret을 만들어냄
            * */
            String ret = "";
            int mode = 0;
            for (int i = 0; i <code.length() ; i++) {
                char c = code.charAt(i);
                if (c == '1') {    //1일때 mode 변경
                    mode= mode==0?1:0;
                    continue;
                }
                if(mode==0){
                //mode = 0 일때, i 가 짝수일 때 ret 에 넣어줌
                    ret+=((i % 2 == 0) ? c + "" : "");
                }else {
                    //mode = 1 일때, i 가 홀수일 때 ret 에 넣어줌
                    ret+=((i % 2 != 0) ? c + "" : "");
                }
            }
            //ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return
            return ret.isEmpty() ? "EMPTY" : ret;

        }
}
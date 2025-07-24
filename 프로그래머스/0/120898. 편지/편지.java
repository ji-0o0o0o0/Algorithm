class Solution {
    public int solution(String message) {
            /*
            * 분석
            * 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return
            * 규칙
            * message 길이 *2 해서 리턴
            * */
            //message 길이체크
            int messageLength = message.length();
            //길이 *2 return
            return messageLength*2;
        }
}
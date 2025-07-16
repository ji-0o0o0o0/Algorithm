class Solution {
    public int solution(String s) {
        //분석
        //숫자와 "Z"가 공백으로 구분되어 담긴 문자열
        //문자열에 있는 숫자를 차례대로 더하는데 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다
        //규칙
        //s 를 배열로 만들어서 하나씩 answer에 넣어준다. Z가 나오면 바로전꺼를 뺀다.
        //코딩화
        //1. 배열 만들기
        String[] array = s.split(" ");
        int answer = 0;
        //2. 하나씩 더하는데 Z면 이전꺼를 빼준다.
        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals("Z")){
                answer-=Integer.parseInt(array[i-1]);
            }else{
                answer+=Integer.parseInt(array[i]);
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(String[] strlist) {
        //분석
        //strlist 각 원소의 길이를 담은 배열을 return
        //규칙
        //strList에 있는 길이만큼 answer 에 넣어준다
        //코딩화
        //1. int 배열을 만든다
        int[] answer = new int[strlist.length];
        //2.strList 돌아가면서 길이를 확인하고 answer에 넣어준다.
        for (int i = 0; i <strlist.length ; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
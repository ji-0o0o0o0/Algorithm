import java.util.*;
class Solution {
    public int solution(String s) {
        //1. 괄호 정보 저장
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        int n = s.length();
        s += s;
        int answer = 0;

        //2. 확인할 문자열의 시작 인덱스를 0부터 n 까지
        A:for(int i = 0; i < n; i++){
          Deque<Character> stack = new ArrayDeque<>();
            for (int j = i; j <i+n ; j++) {
                char c = s.charAt(j);
                if(!map.containsKey(c)){//해시 맵 안에 키가 없다면 열리는 괄호
                    stack.push(c);
                }else {
                    //짝이 맞지 않으면 내부 for 문은 종료하고 for문 A로 이동
                    if(stack.isEmpty()||!stack.pop().equals(map.get(c))){
                        continue A;
                    }
                }

            }
            if(stack.isEmpty()){
                answer++;
            }
        }

        return answer;
    }
}
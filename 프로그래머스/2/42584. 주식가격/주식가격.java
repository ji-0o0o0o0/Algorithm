import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
         int n =  prices.length;
        int[] answer = new  int[n];

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for(int i=1;i<n;i++){
            //stack 이 비어있지 않고 이전 값보다 작은 값이 나올 경우
            //pop()해서 나온 인덱서 j와 i 와의 길이를 구해서 answer[j]에 넣어준다.
            while (!stack.isEmpty()&&prices[i]<prices[stack.peek()]){
                int j =  stack.pop();
                answer[j] = i-j;
            }
            stack.push(i);
        }
        //stack 안에 있는 인덱스 값들 하나씩 빼서 전체 길이에서 뺴준다
        while (!stack.isEmpty()){
            int j = stack.pop();
            answer[j] = n-(j+1);
        }

        return answer;
    }
}
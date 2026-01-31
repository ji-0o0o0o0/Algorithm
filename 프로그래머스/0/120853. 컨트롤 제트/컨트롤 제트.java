import java.util.*;
class Solution {
    public int solution(String s) {
       Deque<Integer> stack = new ArrayDeque<>();
        String[] list = s.split(" ");

        for(String s1 : list){
            if(s1.equals("Z")&&!stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(s1));
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }
}
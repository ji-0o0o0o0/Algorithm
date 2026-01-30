import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Deque<Integer>> list = new ArrayList<>();

        for (int i = 0; i < board[0].length; i++) {
            list.add(new ArrayDeque<>());
        }
        Deque<Integer> result = new ArrayDeque<>();
        int cnt=0;

        //board를 index 에 맞게 stack에 넣어줌
        for(int i = board.length-1;i>=0;i--){
            int[] ints =  board[i];
            for(int j = 0;j<ints.length;j++){
                if(ints[j]==0){continue;}
                list.get(j).push(ints[j]);
            }
        }
        //move에 나온 값으로 result 에 이동
        for (int move : moves) {
            if(list.get(move-1).isEmpty()){continue;}
            int output = list.get(move-1).pop();
            //result 비어있지 않고 들어있는 최근 값이 현재 move 값이랑 같으면 pop
            if (!result.isEmpty() && result.peek() == output) {
                result.pop();
                cnt++;
            } else {
                result.push(output);
            }

        }

        return cnt*2;
    }
}
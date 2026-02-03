import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
         Deque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int lastProgress = 100-progresses[i];
            queue.addLast(lastProgress/speeds[i]+(lastProgress%speeds[i]==0?0:1));
        }
        int max = queue.pollFirst();
        int progressCnt=1;
        while(!queue.isEmpty()){
            int progress = queue.pollFirst();
            if(max>=progress){
                progressCnt++;
            }else{
                result.add(progressCnt);
                max = progress;
                progressCnt=1;
            }
        }
        result.add(progressCnt);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
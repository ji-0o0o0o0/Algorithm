import java.util.*;
import java.util.stream.*;  
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> lists = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(lists);
        int[] answer = {};
        return lists.stream().mapToInt(Integer::intValue).toArray();
    }
}
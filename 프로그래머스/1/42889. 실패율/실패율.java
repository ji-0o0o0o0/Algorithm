import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int N, int[] stages) {
         //1. 스테이지별 도전자 수를 구함
        int[] challenger =new int[N+2];
        for (int stage : stages) {
            challenger[stage]++;
        }
        
        //2. 스테이지 별 실패한 사용자 수 계산
        HashMap<Integer,Double> fails = new HashMap<>();
        double total = stages.length;
        
        //3. 각스테이지 돌면서 실패율 계산
        for (int i = 1; i <=N ; i++) {
            if(challenger[i]==0){
                fails.put(i,0.);
            }else  {
                fails.put(i,(double)challenger[i]/total);
                total-=challenger[i];
            }
        }

        //실패율이 높은 스테이지부터 내림차순으로 정렬
        return fails.entrySet().stream().sorted((o1,o2)-> Double.compare(o2.getValue(),o1.getValue())).mapToInt(Map.Entry::getKey).toArray();
    }
}
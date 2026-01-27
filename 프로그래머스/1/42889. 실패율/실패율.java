import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[][] stage = new double[N][2];
       
       //각 스테이지 별 인원수 미리 카운팅
        int[] cnt = new int[N+2];
        for(int s : stages){
            cnt[s]++;
        }
        
        //실패율 계산
        int total = stages.length;
        for (int i = 0; i <N ; i++) {
            if(total==0){
                stage[i][0]=0;
            }else {
                stage[i][0]=cnt[i+1]/(double)total;
            }
            stage[i][1]=i+1;
            total-= cnt[i+1];
        }
        
        //장렬
       Arrays.sort(stage,(a,b)->{
           if (b[0]!=a[0]){
               return Double.compare(b[0],a[0]);//실패율 내림차순
           }
           return Double.compare(a[1],b[1]);//스테이지 번호 오름차순
       });

        //정렬된 순서대로 스테이지 번호만 추출
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i]=(int)stage[i][1];
        }
        return ans;
    }
}
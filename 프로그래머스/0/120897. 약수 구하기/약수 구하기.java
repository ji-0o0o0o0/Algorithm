import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
            /*
            * 분석
            * n의 약수를 오름차순으로 담은 배열을 return
            * 규칙
            * 반복문으로 n이 1 부터 나눠지는 값을 배열에 담으면 될거같아
            * */
            //배열 생성
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 1; i <=n ; i++) {
               if(n%i==0){
                   arrayList.add(i);
               }
            }
            int[] answer = new int[arrayList.size()];
            for (int i = 0; i <arrayList.size() ; i++) {
                answer[i]= arrayList.get(i);
            }
            return answer;
        }
}
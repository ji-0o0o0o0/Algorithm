import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
         //1. want와 number를 조합해서 wantMap에 넣어준다.
        //2. discount.length-9만큼 for문 돌려서 10일동안 discount10d haspMap에 넣어주고
        //3. wantMap과 discount10d 를 equal해서 true 면 answer++ 해준다.
        HashMap<String,Integer> wantMap = new HashMap<>();
        int answer = 0;
        for(int i=0;i<want.length;i++){
            wantMap.put(want[i],number[i]);
        }

        for(int i=0;i<discount.length-9;i++){
            HashMap<String,Integer> discount10d = new HashMap<>();
            for (int j=0;j<10;j++){
                discount10d.put(discount[i+j],discount10d.getOrDefault(discount[i+j],0)+1);
            }
            if(wantMap.equals(discount10d)){answer++;}
        }

        return answer;
    }
}
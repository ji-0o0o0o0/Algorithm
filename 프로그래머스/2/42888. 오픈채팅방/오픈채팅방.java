import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        //1. record 에 나오는 uid와 닉네임을 hashMap에 넣어준다.(record에서 change일때에 맞춰서 바꿔준다)
        //2. 최종적으로 uid를 비교해서 변화된 닉네임을 넣어준다.

        Map<String,String> map = new HashMap<>();
        for(String s : record) {
            String[] split = s.split(" ");
            if(split[0].equals("Leave"))continue;
            String uid = split[1];
            String nikName = split[2];
            map.put(uid,nikName);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(String str:record){
            String[] split = str.split(" ");
            String action = split[0];
            String uid = split[1];
            if(action.equals("Change"))continue;
            ans.add(map.get(uid)+"님이 "+(action.equals("Leave")?"나갔습니다.":"들어왔습니다."));
        }

        return ans.toArray(new String[0]);
    }
}
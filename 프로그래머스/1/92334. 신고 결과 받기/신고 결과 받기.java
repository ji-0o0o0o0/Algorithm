import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportedId = new HashMap<>();
        Map<String, Integer> reportCnt = new HashMap<>();
        Map<String, Integer> mailCnt = new HashMap<>();
        for(String s: report){
            String[] split = s.split(" ");
            String id = split[0];
            String reportId = split[1];
            if(!reportedId.containsKey(id)){
                reportedId.put(id,new HashSet<>());
            }
            if(!reportedId.get(id).contains(reportId)){
                reportCnt.put(reportId,reportCnt.getOrDefault(reportId,0)+1);
            }
            reportedId.get(id).add(reportId);
        }
        for (String id: reportedId.keySet()) {
            for(String reportId: reportCnt.keySet()) {
                if(reportedId.get(id).contains(reportId)&&reportCnt.get(reportId)>=k){
                    mailCnt.put(id,mailCnt.getOrDefault(id,0)+1);
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(String id: id_list){
            ans.add(mailCnt.getOrDefault(id,0));
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
}
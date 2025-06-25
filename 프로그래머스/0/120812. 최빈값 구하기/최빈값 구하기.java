import java.util.*;
class Solution {
    public int solution(int[] array) {
         //분석
        //최빈값은 주어진 값 중에서 가장 자주 나오는 값
        //정수 배열 array가 매개변수로 주어질 때, 최빈값을 return

        //규칙
        //가장 많이 나오는 값을 확인해서 리턴하면 된다.

        //코딩화
        // 1. hashmap 선언 후 어떤 숫자가 몇번 나왔는지 countMap 에 넣는다
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int max=0;
        int result=0;
        for(int num: countMap.keySet()){
            if(countMap.get(num)>max){
                max = countMap.get(num);
                result = num;
            }else if(countMap.get(num)==max){
                result = -1;
            }
        }
        return result;
    }
}
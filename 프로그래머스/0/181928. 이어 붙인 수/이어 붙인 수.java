class Solution {
    public int solution(int[] num_list) {
            int answer = 0;
            StringBuilder evenNumber = new StringBuilder();
            StringBuilder oddNumber = new StringBuilder();
            for(int i:num_list){
                if(i%2==0){
                    evenNumber.append(i);
                }else {
                    oddNumber.append(i);
                }
            }
            return Integer.parseInt(String.valueOf(evenNumber))+Integer.parseInt(String.valueOf(oddNumber));
        }
}
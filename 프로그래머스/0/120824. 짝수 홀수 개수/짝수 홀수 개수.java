class Solution {
    public int[] solution(int[] num_list) {
            //분석
            //num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return
            //규칙
            //짝수 갯수와 홀수 갯루를 순서대로 answer에 넣어준다.

            //코딩화
            int[] answer = new int[2];
            //1. for 문으로 하나씩 체크해서
            for (int i = 0; i <num_list.length ; i++) {
                if (num_list[i] % 2 == 0) {
                    //2. 짝수면 첫번째에 숫자를 더해주고
                    answer[0]+=1;
                } else if (num_list[i]%2!=0) {
                    //3. 홀수면 두번째에 숫자를 더한다.
                    answer[1]+=1;
                }
            }
            return answer;
        }
}
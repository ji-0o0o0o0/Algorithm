class Solution {
     public int solution(int[] numbers, int k) {
            //분석
            //동그랗게 서서 공 던지기 게임을 할때 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
            //친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return
            //규칙
            // numbers를 쭉 나열 후 1번 부터 한칸씩 뛰면서 k번째 던지는 사람을 구하면 됨
            // 코딩화

            int cnt = -2;
            //for 문으로 k번만큼 반복
            for (int i = 0; i <k ; i++) {
                //몇 번째가 던지게 되는지 확인
                cnt+=2;
            }
            //cnt에 numbers 길이를 나눠준 후 나머지로 numbers 몇번째에 해당하는지 확인한다.
            cnt%=numbers.length;

            return numbers[cnt];
        }
}
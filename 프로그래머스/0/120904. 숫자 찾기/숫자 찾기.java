class Solution {
    public int solution(int num, int k) {
            /*
            * 분석
            * 숫자찾기
            * num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return
            * 규칙
            * num을 String으로 변경 후 배열로 만든다
            * 배열을 k와 비교 후 인덱스 값을 리턴 한다. 
            * */
            //num을 String으로 변경 후 배열로 
            String[] array = (num+"").split("");
            for (int i = 0; i <array.length ; i++) {
                if(array[i].equals(k+"")){
                    //배열을 k와 비교 후 인덱스 값을 리턴
                    return i+1;
                }
            }
            //같은 값이 없으면 -1 return
            return -1;
        }
}
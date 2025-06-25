class Solution {
     public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //분석
        // 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
        // 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2
        // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return

        //규칙
        // denom1, denom2 값을 맞춘다.
        // 곱한 만큼 numer1, nemer2 를 맞춘다
        // 그 값을 answer 에 넣는다.

        int[] answer = new int[2];
        //코딩화
        //1. 최대 공약수를 구한다.
        int gcd = gcd(denom1, denom2);
        //2. 최소 공배수를 구한다.
        int lcm = lcm(denom1, denom2);
        //3. 분모를 맞추고, 분자를 맞춘 후 더한다.
        //분자
        answer[0]=numer1*(lcm/denom1)+numer2*(lcm/denom2);
        //분모
        answer[1]= lcm;
        //4. 분모와 분자의 최대 공약수를 구하고 분모, 분자에 나눠준다.
        int gcd1 = gcd(answer[0],answer[1]);
        answer[0] =answer[0]/gcd1;
        answer[1] =answer[1]/gcd1;

        return answer;
    }
    //최대 공약수
    public int gcd(int a, int b) {
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
    }
    //최소 공배수
    public int lcm(int a, int b) {
        return a*b / gcd(a, b);
    }
}
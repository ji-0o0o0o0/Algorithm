class Solution {
    public int solution(int a, int b, int c) {
            if (a==b&&b==c) {//세 숫자가 모두 같다
                return (a + b + c) * (pow(a,2) + pow(b,2) + pow(c,2) ) * (pow(a,3) + pow(b,3) + pow(c,3) );
            }else if(a!=b&&b!=c&&c!=a){//모두 다를때
                return a+b+c;
            } else {
                return (a + b + c) * (pow(a,2) + pow(b,2) + pow(c,2) ) ;
            }
        }
        public int  pow(int base, int exponent){
            return (int) Math.pow(base,exponent);
        }
}
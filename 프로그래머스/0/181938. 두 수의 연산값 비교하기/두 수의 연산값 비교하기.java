class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(""+a+b);
        int aab = 2*a*b;
        return Math.max(ab, aab);
    }
}
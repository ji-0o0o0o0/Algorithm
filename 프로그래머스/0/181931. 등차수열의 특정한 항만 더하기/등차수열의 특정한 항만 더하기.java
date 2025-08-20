class Solution {
    public int solution(int a, int d, boolean[] included) {
            int[] ints = new int[included.length];
            ints[0]=a;
            int sum = 0;

            for (int i = 0; i <included.length ; i++) {
                if(i>0){
                    ints[i]=ints[i-1]+d;
                }
                if(included[i]){
                    sum+=ints[i];
                }
            }
            return sum;
        }
}
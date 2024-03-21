class Solution {
    public int mySqrt(int x) {
        // return (int) Math.sqrt(x);

        long n=x;
        while(n * n >x ){
            n = (n + x /n) /2;// (4 +4/4 ) /2 =2.5
        }
        return (int ) n;
    }
}

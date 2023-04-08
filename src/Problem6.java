public class Problem6 {
    /**
     * @ findPowerOfNum - a set of statements that calculates n power of m
     * @ n - given number
     * @ m - given degree of number
     * @ return - calculates the n power of m with using recursion

     */
    public static int findPowerOfNum(int n, int m) {
        if(m==0){
            return 1; //if counter m=0, it returns 1
        }
        else{
            return findPowerOfNum(n,m-1)*n; //in recursive case, it returns n power of m with using recursion
        }
    }
}

public class Problem4 {
    /**
     * @ findFactorial - a set of statements that calculates factorial of given number
     * @ n - given number
     * @ return - calculates the factorial of given number with using recursion

     */
    public static int findFactorial(int n) {
        if(n==1){ //base case return 1 if n=1
            return 1;
        }
        else{ //recursive case returns factorial of number with using recursion
            return findFactorial(n-1)*n;
        }
    }
}

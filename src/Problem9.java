public class Problem9 {
    /**
     * @ findPowerOfNum - a set of statements that calculates the binomial coefficient
     * @ n - given number
     * @ k - given number
     * @ return - calculates the binomial coefficient of two given numbers with using recursion

     */
    public static int findBinomialCoefficient(int n, int k) {
        if(k==0 || k==n) { //base case if k=n or k=0 it returns 1
            return 1;
        }
        else{ //recursive case calculate and return the answer
            return findBinomialCoefficient(n-1,k-1)+findBinomialCoefficient(n-1,k);
        }
    }
}

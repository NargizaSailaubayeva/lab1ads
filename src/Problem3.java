public class Problem3 {
    /**
     * @ checkPrimeOrComposite - a set of statements that checks if a given number is prime or composite
     * @ n - given number
     * @ m - checks if the number is even or odd, m=n/2
     * @ return - checks a given number is prime or composite with using recursion

     */
    public static String checkPrimeOrComposite(int n, int m) {
        if (m == 1){ //base case returns "Prime" if m=1
            return "Prime";
        }
        else if(n%m ==0){ //second base case returns "composite" if n is divisible by m without remainder
            return "Composite";
        }
        else{ //recursive case returns function with using recursion
            return checkPrimeOrComposite(n,m-1);
        }
    }
}

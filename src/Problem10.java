public class Problem10 {
    /**
     * @ findGCD - a set of statements that calculates the gcd
     * @ a - given number
     * @ b - given number
     * @ return - calculates the gcd of two given numbers with using recursion

     */
    public static int findGCD(int a, int b) {
        if(b==0){ //base case if b=0 it returns a
            return a;
        }
        else{ //recursive case calculate and return the answer
            return findGCD(b,a%b);
        }
    }
}

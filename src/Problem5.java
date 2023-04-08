public class Problem5 {
    /**
     * @ findFibonacci - a set of statements that calculates fibonacci sequence of given number
     * @ n - given number
     * @ return - calculates the fibonacci sequence of given number with using recursion

     */
    public static int findFibonacci(int n) {
        if(n==0){
            return 0; //if n=0 it returns 0
        }
        else if(n==1){
            return 1; // if n=1 it returns 1
        }
        else{
            return findFibonacci(n-1)+findFibonacci(n-2); //in recursive case, return sum of functions with using recursion
        }
    }
}

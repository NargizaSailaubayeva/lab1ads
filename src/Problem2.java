public class Problem2 {
    /**
     * @ findAverage - a set of statements that calculates average of given array
     * @ arr - array of elements where need to find average of them
     * @ n - size of an array
     * @ return - calculates the average value of the function with using recursion

     */
    public static double findAverage(int[] arr, int n) {
        if (n == 0)// base case return 0, if n=0
            return 0;
        else { //recursive case returns minimum of function with using recursion
            double sum = findAverage(arr, n - 1)*(n-1);
            sum += arr[n-1];
            return sum/n;
        }
    }
}

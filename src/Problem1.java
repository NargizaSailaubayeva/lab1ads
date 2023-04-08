public class Problem1 {
    /**
    * @ findMin- a set of statements that calculates minimum of given array
    * @ arr - array of elements where need to find minimum
    * @ n - size of an array
    * @ return - calculates the minimum element of the array with using recursion
     */
    public static int findMin(int[] arr, int n) {
        if (n == 1) //base case return first element of array if n=1
            return arr[0];
        else { //recursive case return minimum of function
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
}

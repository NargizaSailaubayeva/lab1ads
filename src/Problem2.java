public class Problem2 {
    public static double findAverage(int[] arr, int n) {
        if (n == 0)
            return 0;
        else {
            double sum = findAverage(arr, n - 1)*(n-1);
            sum += arr[n-1];
            return sum/n;
        }
    }
}

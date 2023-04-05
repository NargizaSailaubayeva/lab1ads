public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 1};
        int n = 4;
        System.out.println(findAverage(arr, n));
    }

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

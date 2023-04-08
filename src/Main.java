
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the problem number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1 -> {
                int[] arr = {10, 1, 32, 3, 45};
                int min = Problem1.findMin(arr, arr.length);
                System.out.println("Min from arr is: " + min);
            }
            case 2 -> {
                int[] arr2 = {3, 2, 4, 1};
                double avg = Problem2.findAverage(arr2, arr2.length);
                System.out.println("The average value is: " + avg);
            }
            case 3 -> {
                int num = 7;
                String res = Problem3.primeOrComposite(num, num / 2);
                System.out.println("Given number is: " + res);
            }
            case 4 -> {
                int m = 5;
                int fact = Problem4.Factorial(m);
                System.out.println("The factorial of " + m + " is: " + fact);
            }
            case 5 -> {
                int fibon = 17;
                int fibnum = Problem5.Fibonacci(fibon);
                System.out.println("The Fibonacci sequence of " + fibon + " is: " + fibnum);
            }
            case 6 -> {
                int number = 2;
                int degree = 10;
                int pow = Problem6.powerOfNum(number, degree);
                System.out.println(number + " to the power of  " + degree + " is: " + pow);
            }
            case 9 -> {
                int numnum = 7;
                int coef = 3;
                int result = Problem9.binomialCoefficient(numnum, coef);
                System.out.println("Binomial coefficient of " + numnum + " and " + coef + " is: " + result);
            }
            case 10 -> {
                int a = 32;
                int b = 48;
                int gcdnum = Problem10.gcd(a, b);
                System.out.println("GCD of " + a + " and " + b + " is: " + gcdnum);
            }
            default -> System.out.println("Invalid problem number");
        }
    }

}

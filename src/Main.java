
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the problem number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: // call problem 1
                int[] arr = {10, 1, 32, 3, 45};
                int min = Problem1.findMin(arr, arr.length);
                System.out.println("Min from arr is: " + min);

            case 2: // call problem 2
                int[] arr2 = {3, 2, 4, 1};
                double avg = Problem2.findAverage(arr2, arr2.length);
                System.out.println("The average value is: " + avg);

            case 3: // call problem 3
                int num = 7;
                String res = Problem3.checkPrimeOrComposite(num, num / 2);
                System.out.println("Given number is: " + res);

            case 4: // call problem 4
                int m = 5;
                int fact = Problem4.findFactorial(m);
                System.out.println("The factorial of " + m + " is: " + fact);

            case 5: // call problem 5
                int fibon = 17;
                int fibnum = Problem5.findFibonacci(fibon);
                System.out.println("The Fibonacci sequence of " + fibon + " is: " + fibnum);

            case 6: // call problem 6
                int number = 2;
                int degree = 10;
                int pow = Problem6.findPowerOfNum(number, degree);
                System.out.println(number + " to the power of  " + degree + " is: " + pow);

            case 7: // call problem 7
                int[] arr3 = {1, 4, 6, 2};
                Problem7.reverse(arr3, 0, arr3.length - 1);
                break;
            case 8: // call problem 8
                String str = "123456";
                String consist = Problem8.consistDigit(str);
                System.out.println("Does the string contain only digits? " + consist);
                break;

            case 9: // call problem 9
                int numnum = 7;
                int coef = 3;
                int result = Problem9.binomialCoefficient(numnum, coef);
                System.out.println("Binomial coefficient of " + numnum + " and " + coef + " is: " + result);

            case 10: // call problem 10
                int a = 32;
                int b = 48;
                int gcdnum = Problem10.gcd(a, b);
                System.out.println("GCD of " + a + " and " + b + " is: " + gcdnum);

            default: // if you will write another number
                System.out.println("Wrong problem number");
        }
    }

}

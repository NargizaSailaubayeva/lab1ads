# Laboratory 1 Algorithms and Data Structures
## Description
In this repository, I made laboratory 1 for Algorithms and Data Structures by using function and recursion.
+ ***Algorithms and Data Structures*** - the main focus of the course is designed on solving computational problems that involve collections of data.
+ ***Function*** is a block of organized, reusable code that is used to perform a single, related action.
+ ***Recursion*** is a programming technique where a function calls itself with some part of the task. And it is the process of repeating items in a self-similar way. 
![function](https://4.bp.blogspot.com/-KrDSb9PB4uM/VXbBkXYtPxI/AAAAAAAAAKk/mFmhFmNS8X4/s1600/C-Function-Definition.jpg)

![recursion](https://media.geeksforgeeks.org/wp-content/cdn-uploads/recursion.jpg)
___
### Promblem 1
*In this problem, I wrote a code in which the function returns the minimum of them. In this code I have a function `findMin(int[] arr, int n)`.*
#### Definitions
+ @ findMin- a set of statements that calculates minimum of given array
+ @ arr - array of elements where need to find minimum
+ @ n - size of an array
+ @ return - calculates the minimum element of the array with using recursion
#### Solution
```java
 public static int findMin(int[] arr, int n) {
        if (n == 1) //base case return first element of array if n=1
            return arr[0];
        else { //recursive case return minimum of function
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
```
___
### Problem 2
*In this problem, I wrote a code in which the function returns the average of them. In this code I have a function `findAverage(int[] arr, int n)`.*
#### Definitions
+ @ findAverage - a set of statements that calculates average of given array
+ @ arr - array of elements where need to find average of them
+ @ n - size of an array
+ @ return - calculates the average value of the function with using recursion
#### Solution
```java
public static double findAverage(int[] arr, int n) {
        if (n == 0)// base case return 0, if n=0
            return 0;
        else { //recursive case returns minimum of function with using recursion
            double sum = findAverage(arr, n - 1)*(n-1);
            sum += arr[n-1];
            return sum/n;
        }
    }
```
___
### Problem 3
*In this problem, I wrote a code where the function checks a given number prime or composite. In this code I have a function `checkPrimeOrComposite(int n, int m)`.*
#### Definitions
+ @ checkPrimeOrComposite - a set of statements that checks if a given number is prime or composite
+ @ n - given number
+ @ m - checks if the number is even or odd, m=n/2
+ @ return - checks a given number is prime or composite with using recursion
#### Solution
```java
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
```
___
### Problem 4
*In this problem, I wrote a code where the function calculates the factorial of a given number with using recursion. In this code I have a function `findFactorial(int n)`.*
#### Definitions
+ @ findFactorial - a set of statements that calculates factorial of given number
+ @ n - given number
+ @ return - calculates the factorial of given number with using recursion
#### Solution
``` java
public static int findFactorial(int n) {
        if(n==1){ //base case return 1 if n=1
            return 1;
        }
        else{ //recursive case returns factorial of number with using recursion
            return findFactorial(n-1)*n;
        }
    }
```
___
### Problem 5
*In this problem, I wrote a code where the function calculates the fibonacci sequence of a given number with using recursion. In this code I have a function `findFibonacci(int n)`.*
#### Definitions
+ @ findFibonacci - a set of statements that calculates fibonacci sequence of given number
+ @ n - given number
+ @ return - calculates the fibonacci sequence of given number with using recursion
#### Solution
```java 
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
```
___
### Problem 6
*In this problem, I wrote a code where the function calculates the m power of a given number with using recursion. In this code I have a function `findPowerOfNum(int n, int m)`.*
#### Definitions
+ @ findPowerOfNum - a set of statements that calculates n power of m
+ @ n - given number
+ @ m - given degree of number
+ @ return - calculates the n power of m with using recursion
#### Solution
```java 
public static int findPowerOfNum(int n, int m) {
        if(m==0){
            return 1; //if counter m=0, it returns 1
        }
        else{
            return findPowerOfNum(n,m-1)*n; //in recursive case, it returns n power of m with using recursion
        }
    }
```
___
### Problem 7
*In this problem, I wrote a code where the function reverses the elements of an array with using recursion. In this code I have a function `reverse(int[] arr, int start, int end)`.*
#### Definitions
+ @ reverse - a set of statements that reverses the elements of an array between the given start and end indices.
+ @ arr the array to be reversed
+ @ start the starting index of the portion to be reversed
+ @ end the ending index of the portion to be reversed
#### Solution
```java 
public static void reverse(int[] arr, int start, int end) {
            if (end <= start) { //base case
                for (int j : arr) {
                    System.out.print(j + " ");
                }

            } else { //recursive case
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                reverse(arr, start + 1, end - 1);
            }
        }
```
___
### Problem 8
*In this problem, I wrote a code where the function checks the string does it consist only digits with using recursion. In this code I have a function `consistDigit(String s)`.*
#### Definitions
+ @ consistDigit - a set of statements that checks whether the string consists of digits only
+ @ s - given number
+ @ return - checks whether the string consists of digits only with using recursion if is digit it returns yes if not no

#### Solution
```java 
public static String consistDigit(String s) {
        if (s.length() == 0) { //base case return "yes" if the length of the string is zero
            return "Yes";
        } else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') { //recursive case checks whether every character of the s is a digit
            return consistDigit(s.substring(1));
        } else { // another case it returns "no"
            return "No";
        }
    }
```
___
### Problem 9
*In this problem, I wrote a code where the function calculates the binomial coefficient of given numbers with using recursion. In this code I have a function `findBinomialCoefficient(int n, int k)`.*
#### Definitions
+ @ findPowerOfNum - a set of statements that calculates the binomial coefficient
+ @ n - given number
+ @ k - given number
+ @ return - calculates the binomial coefficient of two given numbers with using recursion
#### Solution
```java 
public static int findBinomialCoefficient(int n, int k) {
        if(k==0 || k==n) { //base case if k=n or k=0 it returns 1
            return 1;
        }
        else{ //recursive case calculate and return the answer
            return findBinomialCoefficient(n-1,k-1)+findBinomialCoefficient(n-1,k);
        }
    }
```
___
### Problem 10
*In this problem, I wrote a code where the function calculates the GCD of given numbers with using recursion. In this code I have a function `findGCD(int a, int b)`.*
#### Definitions
+ @ findGCD - a set of statements that calculates the gcd
+ @ a - given number
+ @ b - given number
+ @ return - calculates the gcd of two given numbers with using recursion
#### Solution
```java 
public static int findGCD(int a, int b) {
        if(b==0){ //base case if b=0 it returns a
            return a;
        }
        else{ //recursive case calculate and return the answer
            return findGCD(b,a%b);
        }
    }
```
___
### Main
*In this problem, I wrote a code where other previously written functions are called.*
#### Solution
```java
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
                break;

            case 2: // call problem 2
                int[] arr2 = {3, 2, 4, 1};
                double avg = Problem2.findAverage(arr2, arr2.length);
                System.out.println("The average value is: " + avg);
                break;

            case 3: // call problem 3
                int num = 7;
                String res = Problem3.checkPrimeOrComposite(num, num / 2);
                System.out.println("Given number is: " + res);
                break;

            case 4: // call problem 4
                int m = 5;
                int fact = Problem4.findFactorial(m);
                System.out.println("The factorial of " + m + " is: " + fact);
                break;

            case 5: // call problem 5
                int fibon = 17;
                int fibnum = Problem5.findFibonacci(fibon);
                System.out.println("The Fibonacci sequence of " + fibon + " is: " + fibnum);
                break;

            case 6: // call problem 6
                int number = 2;
                int degree = 10;
                int pow = Problem6.findPowerOfNum(number, degree);
                System.out.println(number + " to the power of  " + degree + " is: " + pow);
                break;

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
                int result = Problem9.findBinomialCoefficient(numnum, coef);
                System.out.println("Binomial coefficient of " + numnum + " and " + coef + " is: " + result);
                break;

            case 10: // call problem 10
                int a = 32;
                int b = 48;
                int gcdnum = Problem10.findGCD(a, b);
                System.out.println("GCD of " + a + " and " + b + " is: " + gcdnum);
                break;

            default: // if you will write another number
                System.out.println("Wrong problem number");
        }
    }

}
```
___

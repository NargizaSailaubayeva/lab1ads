# lab1ads
## Description
In this repository, I made lab 1 for ads by using function and recursion.
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
*In this problem, I wrote a code where the function checks a given number prime or composite. In this cose I have a function `checkPrimeOrComposite(int n, int m)`.*
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

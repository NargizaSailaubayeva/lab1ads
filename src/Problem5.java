public class Problem5 {
    public static int Fibonacci(int n) {
        if(n==0){
            return 0; //if n=0 it returns 0
        }
        else if(n==1){
            return 1; // if n=1 it returns 1
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2); //in recursive case, return sum of functions
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(Fibonacci(n));
    }
    public static int Fibonacci(int n) {
        if(n==0){
            return 0; //if n=0 it returns 0
        }
        else if(n==1){
            return 1; // if n=1 it returns 1
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2); //in recursive case, returns sum of functions
        }
    }
}

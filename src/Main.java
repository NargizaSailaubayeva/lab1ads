public class Main {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(Factorial(n));
    }
    public static int Factorial(int n) {
        if(n==1){
            return 1; //In this base case, if n=1 it returns 1
        }
        else{
            return Factorial(n-1)*n; //If base case does not match the criteria, this recursive case will work
        }
    }
}

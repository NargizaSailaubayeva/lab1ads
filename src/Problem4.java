public class Problem4 {
    public static int Factorial(int n) {
        if(n==1){
            return 1;
        }
        else{
            return Factorial(n-1)*n;
        }
    }
}

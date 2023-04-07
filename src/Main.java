public class Main {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        System.out.println(binomialCoefficient(n,k));
    }
    public static int binomialCoefficient(int n, int k) {
        if(k==0 || k==n) {
            return 1;
        }
        else{
            return binomialCoefficient(n-1,k-1)+binomialCoefficient(n-1,k);
        }
    }
}

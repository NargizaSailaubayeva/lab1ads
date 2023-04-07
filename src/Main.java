public class Main {
    public static void main(String[] args) {
        int a = 32;
        int b = 48;

        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}

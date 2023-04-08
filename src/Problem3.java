public class Problem3 {
    public static String primeOrComposite(int n, int m) {
        if (m == 1){
            return "Prime";
        }
        else if(n%m ==0){
            return "Composite";
        }
        else{
            return primeOrComposite(n,m-1);
        }
    }
}

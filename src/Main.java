public class Main {
    public static void main(String[] args) {
        int n = 9;
        int m = n/2;
        System.out.println(primeOrComposite(n, m));
    }
    public static String primeOrComposite(int n, int m) {
        if (m == 1){
            return "Prime"; //if m =1 then this function returns the word prime
        }
        else if(n%m ==0){
           return "Composite"; // if n is divisible by m without remainder , it returns the word composite, if the first base case does not match the criteria
        }
        else{
            return primeOrComposite(n,m-1); //if the first and second base case do not match the criteria, in this case will work recursive case
        }

    }
}

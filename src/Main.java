public class Main {
    public static void main(String[] args) {
        int n = 2;
        int m = 10;

        System.out.println(powerOfNum(n,m));
    }
    public static int powerOfNum(int n, int m) {
        if(m==0){
            return 1; //if counter m=0, it returns 1
        }
        else{
            return powerOfNum(n,m-1)*n; //in recursive case, it returns n*recursion
        }
    }
}

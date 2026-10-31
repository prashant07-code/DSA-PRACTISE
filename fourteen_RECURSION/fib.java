package fourteen_RECURSION;

public class fib {
    public static int fibc(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibc(n-1) + fibc(n-2);
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibc(n));
    }
    
}

package fourteen_RECURSION;

public class pow_optimised {
   public static int  optimisedpower(int x, int n){  // O(logn)
        if(n==0){
            return 1;
        }
        int halfpower = optimisedpower(x, n/2);
        int halfpowersq= halfpower*halfpower;
// n is odd
    if(n%2 !=0){
       halfpowersq = x* halfpower;
    }
    return halfpowersq;
}
    public static void main (String args[]){
        int n =2;
        int x=5;
        System.out.println(optimisedpower(x, n));
    }

}
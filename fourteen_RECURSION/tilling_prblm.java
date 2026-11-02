package fourteen_RECURSION;

public class tilling_prblm {
    public static int tillingway(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tillingway(n-1);
        int fnm2 = tillingway(n-2);
        int total_ways = fnm1+fnm2;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(tillingway(4));
    }
}

public class powerof_2 {
    public static boolean is_powerof2(int n){
        return(n&(n-1))==0;

    }
    public static void main(String[] args) {
        System.out.println(is_powerof2(8));
    }
    
}

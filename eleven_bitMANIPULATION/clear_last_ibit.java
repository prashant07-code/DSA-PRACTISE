public class clear_last_ibit {
    public static int clearlastibits(int n, int i){
        int bitmask =(~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastibits(15,2));
    }
    
}

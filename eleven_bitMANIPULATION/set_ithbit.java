public class set_ithbit {
    public static int Setithbit(int n,int i ){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Setithbit(10,2));
    }
    
}

public class update_ithbit {
    public static int clearithbit(int n, int i){
        return n & ~(1 << i);
    }
    
    public static int set_ithbit(int n, int i){
        return n | (1 << i);
    }
    
    public static int Updateithbit(int n, int i, int newbit){
        if(newbit==0){
            return clearithbit(n,i);
        }
        else {
            return set_ithbit(n,i);
        }
    }
    public static void main(String[] args) {
        System.out.println(Updateithbit(10, 2, 1));
    }
}

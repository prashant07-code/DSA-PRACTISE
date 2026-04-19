public class inverted_num_pryd {
    public static void invert_number_pryd(int n) {
        // outer
        for (int i =1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        invert_number_pryd(4);
    }
}

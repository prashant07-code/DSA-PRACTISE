public class floyd_triangle {
    public static void floyd_trnl(int n ){
        int k = 1;
        // outer loop
        for ( int i =1; i<=n; i++){
            //inner loop
            for(int j = 1; j<=i; j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
    }
}
    public static void main(String[] args) {
        floyd_trnl(4);
    }
}

public class inverted_rotated_pyramid {
    public static void invert_rotated_pryd(int n){
        // outer loop
        for (int i =1; i<=n; i++){
            //space 
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");

            }
        // star
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        invert_rotated_pryd(4);
    }
}


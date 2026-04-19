public class hallow_rohambus {
    public static void solid_rohambus_pattern(int n){
        for(int i = 1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-1); j++){
                System.out.print(" ");
            }
            // hallow rectangle-stars
            for(int j=1; j<=n; j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
                
            }
            }
        System.out.println();
        }
    } 
    public static void main(String[] args) {
        solid_rohambus_pattern(10);
    }
}

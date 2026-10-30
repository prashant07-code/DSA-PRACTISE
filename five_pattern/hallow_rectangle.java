public class hallow_rectangle {
    public static void hallow_rect(int r, int c){
        // outer loop
        for(int i = 1; i<=r; i++){
            //inner loop
            for (int j =1; j<=c; j++){
                //cell(i,j)
                if(i==1 || i==r || j==1 || j==c){
                    // boundary cell 
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
        hallow_rect(4, 5);
    }
    }

public class spiral_matrix {
    public static void print_spiral(int arr[][]){
    int startrow = 0;
    int startcoln = 0;
    int endrow = arr.length-1;
    int endcoln = arr[0].length-1;
    while ((startrow<=endrow && startcoln<=endcoln)) {
        // top
        for(int j = startcoln; j<=endcoln; j++){
            System.out.print(arr[startrow] [j]+ " ");
        }
        // right
        for(int i = startrow+1; i<=endrow; i++){
            System.out.print(arr[i] [endcoln]+ " ");
        }
        // bottom
        for(int j = endcoln-1; j>= startcoln; j--){
            if(startrow == endrow){
                break;
            }
            System.out.print(arr[endrow] [j]+ " ");
        }
        // left
        for (int i= endrow-1; i>=startrow; i-- ){
            if ((startrow==endrow)) {
                break;
            }
            System.out.print(arr[i] [startcoln]+ " ");
        }
        startcoln++;
        startrow++;
        endcoln--;
        endrow--;
    }
    System.out.println();
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                            {13,14,15,16}};
                            print_spiral(matrix);
    }
}

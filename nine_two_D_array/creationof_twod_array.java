public class creationof_twod_array {
    public static void main(String[] args) {
        int arr [][] = new int [3][3];
        // input
        int count = 1;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = count;
                count++;
            }
        }
        // output
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

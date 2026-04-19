public class largestnum {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest= arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("the smallest element is :" +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr [] = {5,6,2,10};
        System.out.println("largest element is :" +largest(arr));
    }
}

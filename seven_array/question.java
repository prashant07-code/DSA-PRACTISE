import java.util.*;

public class question {

    // 1. print the largest and smallest number.
    /*
    public static int largestnumber(int number[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i])
                smallest = number[i];
        }
        System.out.println("smallest value is : " + smallest);
        // return largest;
    }
    */
    // 2. sum and average of five number.
    public static void sumOfFiveInt() {
        
        int arr[] = {2, 5, 8, 4, 9};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        float average =  (float) sum/arr.length;
                System.out.println(average);
        
    }
    //3. write a program in java to calculate the average of an integer array of 5 elements.
    public static void maximunNum() {
        
        
        int arr[] = {2, 5, 8, 4, 9};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
             max = arr[i];
        }
                System.out.println(max);
    }
    // 4. traverse of a array.
    public static void traverse(){
        int arr[] = { 6,4,7,9,12,34};
        for(int i = 0; i < arr.length; i++){
            int g = arr[i];
            System.out.print(g + " ");

        }
    }

    public static void main(String[] args) {
        // int number[] = {1,2,6,3,5};
        // System.out.println("largest value : " + largestnumber(number));
       // sumOfFiveInt();
       maximunNum();
       traverse();
  }

}

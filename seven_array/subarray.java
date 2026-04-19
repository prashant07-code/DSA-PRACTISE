public class subarray {
    public static void maxSubArraySum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
       
   for(int i=0; i<number.length; i++){
     int start = i;
   
     for(int j=i; j<number.length; j++){
        int end = j;
        currSum = 0;
        for(int k=start; k<=end; k++){
          //  System.out.print(number[k]+" ");
          // subarray sum
          currSum += number[k];
          
            
        }
        System.out.println(currSum);
        if(maxSum<currSum){
            maxSum = currSum;
        }
     }
     }
    System.out.println("max sum = " + maxSum);
    }
    
    public static void main(String[] args) {
        int number[] = {3,5,7,8,12,24,25};
        maxSubArraySum(number);

    }
    
}

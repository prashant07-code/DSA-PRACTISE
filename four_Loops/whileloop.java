import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




     /*    // 1.concept.
        int counter = sc.nextInt();
        
        while( counter < 100){
        System.out.println("jai maa saraswati");
        counter++;
        }
        System.out.println("print JMS 10x"); */


        // 2. print sum of first n natural number.
        
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= num){

            sum  += i;
            i++;
           
        }
         System.out.println(" the sum is : " + sum);
    }
    
}

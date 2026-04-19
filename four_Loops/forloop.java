import java.util.*;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




      /*   int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("compassionate");
        } */


        

          /*   // print   *****
                   //  *****
                   //  ***** 
                   //  ***** 
                   //  ***** 

                   for(int i = 1; i <= 5; i++){
                    System.out.println("******"); 
                   
                   } */



                 /*    // 1. print reverse of a number.

                    int n = 10899;
                    while(n > 0){
                        int lastDigit = n % 10;
                        System.out.print(lastDigit);
                        n = n/10;

                    }
                    System.out.println(); */


                    // 2.reverse of a given number.
                    int n = 10899;
                    int rev = 0;
                    while(n >0){
                        int lastDigit = n%10;
                        rev = (rev*10) + lastDigit;
                        n = n/10;
                    }
                    System.out.println(rev);
                
                    

    }
    
}

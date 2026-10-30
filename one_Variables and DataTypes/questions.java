import java.util.*;
public class questions {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          

      /*   // 1.sum of two number.
        int a = 5;
        int b = 20;
        int sum = a+b;
        System.out.println(sum); */

        

       /*  // 2. sum of two number input from user.
            int a =  sc.nextInt();
            int b =  sc.nextInt();
            int sum = a+b;
            System.out.println(sum); */


          /*   // 3.product.
             int a =  sc.nextInt();
            int b =  sc.nextInt();
            int product = a*b;
            System.out.println(product); */
          


         /*    // 4.area of circle.
            float rad = sc.nextFloat();
            float area = (3.14f * rad * rad);
            System.out.println(area); */


          /*   // 5. average of three number.
             int a = sc.nextInt();
             int b = sc.nextInt();
             int c = sc.nextInt();
             int  sum  = a + b + c;
              int average = sum/3;
              System.out.println(average);  */

              /*  // 6. area of square
              int a = sc.nextInt();
              int area = a * a;
              System.out.println(area); */
                   

              // 6. what is the output of this expression.
             /*  byte b = 4;
              char c = 'a';
              short s = 512;
              int i = 1000;
              float f = 3.14f;
              double d = 99.9954;
               double result = (f * b) + (i % c) - (d * s); 
               System.out.println(result); */



             /*   // 7.this is provide error or not.
               int $ = 24;
               System.out.println($);  */



               // 8. enter cost of 3 items from the user (using float data type )- a pencil,a pen, and an eraser. 
               //you have to output the total cost of the items back to the user as their bill.
               float pencil=sc.nextFloat();
               float pen=sc.nextFloat();
               float eraser=sc.nextFloat();
               float total=pencil+pen+eraser;
               System.out.println("Bill is : "+total);
               //Add on - with 18% tax
               float newTotal=total+ (0.18f * total);
               System.out.println("Bill with 18% tax : "+ newTotal);
               






        }
    
}

import java.util.*;
public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



      /*   // 1. adult or not?
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("your are adult");

        }
        if(age > 13 && age < 18 ){
            System.out.println("teenager");

        }
        else{
            System.out.println("you are not adult");
        } */



          /*   // 2. largest of two number.
            int a = sc.nextInt();
            int b = sc.nextInt();
             if(a >= b){
                System.out.println("a is largest number two.");
             }else{
                System.out.println("b is largest number two.");
             } */


            /*  // 3. print if a number is odd or even?
             
             int num = sc.nextInt();
             if((num % 2) == 0){
                System.out.println("the number is even");

             }else{
                System.out.println("the number is odd");
             }  */

              /*   // 4.

                 int age = sc.nextInt();

        if(age > 18){
            System.out.println("your are adult");

        }
         else if(age > 13 && age < 18 ){
            System.out.println("teenager");

        }
        else{
            System.out.println("you are not adult");
        }  */




         /*    // 5.income tax calculator.
            double income = sc.nextFloat();
            double tax;
            if(income < 500000){
                tax = 0;
                 System.out.println("your tax is : " + tax);
            }else if(income >= 500000 && income < 1000000){
                tax = (0.2 * income);
                 System.out.println("your tax is : " + tax);

            }else{
                tax = (0.3 * income);
                System.out.println("your tax is : " + tax);

            }  */



             /*    // 6.print the largest of three number.

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(a >= b && a >= c){
                    System.out.println("the largest number is a");
                }else if(b >= c){
                    System.out.println("the largest number is c");

                }else{
                    System.out.println("the largest number is c");
                }  */



                 /*    // 7.ternary operator.
                    int number = sc.nextInt();
                   String type = (number % 2) == 0 ? "even" : "odd";
                    System.out.println(type); */




                  /*   // 8.check if a student will pass or fail.

                    int marks = sc.nextInt();
                    System.out.println("enter your marks :" + marks);
                    String Grade = (marks >= 33 ) ? "pass" : "fail";
                    System.out.println("your grade is :" + Grade); */




                 /*    // 9.switch statement.
                    int num = sc.nextInt();
                    switch(num){
                        case 1 : System.out.println("samosa");
                        break;
                        case 2 : System.out.println("banana");
                        break;
                        case 3 : System.out.println("dates");
                        break;
                        default : System.out.println("i realized i was dreaming");
                    }  */



                 /* 10. calculator.
                    System.out.println("Enter a : ");
                   int a = sc.nextInt();
                   System.out.println("Enter b : ");
                   int b = sc.nextInt();
                   System.out.println("Enter operator : ");
                    char operator = sc.next().charAt(0);

                    
                   switch(operator){
                    case '+' : System.out.println(a+b);
                    break;
                    case '-' : System.out.println(a-b);
                    break;
                    case '*' : System.out.println(a*b);
                    break;
                    case '/' : System.out.println(a/b);
                    break;
                    case '5' : System.out.println(a%b);
                    break;
                    default : System.out.println("wrong operator");
                   } */



         /*      // 11. largest of four number.
              int a = sc.nextInt();
              int b = sc.nextInt();
              int c = sc.nextInt();
              int d = sc.nextInt();

              if((a > b ) && (a > c && a > d)){
                System.out.println("the largest n0. is : " + a);
              }
              else if(b > c && c > d ) {
                System.out.println("the largest no. is : " + b);
                
              }
              else if(c > d){
                System.out.println("the largest no. is :" + c);

              }
              else{
                System.out.println("the largest no. is : "+ d);
              }  */

    // ternary operators.
    int n = sc.nextInt();
    String RC = (n > 18) ? "adult" : "not adult";
    System.out.println(RC); 
                



    }
    
}

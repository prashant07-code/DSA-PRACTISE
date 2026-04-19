import java.util.*;
import java.util.function.BiConsumer;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();



      //1. pattern *
               //    **
               //    ***
               //    ****
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        /*     // 2. pattern.
            //     *****
            //     ****
            //     ***
            //     **
            //     *
             for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }  */



        /*     // 3.print half pyramid pattern.
                // 1
                // 12
                // 123
                // 1234
                 for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        } */

        

            // print pattern A
                  //         BC
                  //         DEF
                  //         GHIJ

                  char ch = 'A';
            for(int i = 1; i <= n; i++){
              for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
                             


                             



    }
    
}

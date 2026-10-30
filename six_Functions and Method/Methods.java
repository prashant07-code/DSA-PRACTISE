import java.util.*;
public class Methods {


 /*    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    } */

        // calculate sum using the function.
        public static int sum(int a, int b){
            return a+b;

        }
        public static float sum(float a, float b){
            return a+b;
        }
        public static boolean isprime(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean isprime = true;
            for(int i = 2; i <= n-1; i++){
                if(n%2 == 0){// completely divisible
                    isprime = false;

                }
            }
            return isprime;

        }

    public static void main(String[] args) {
        // System.out.println(sum(4,7 ));
        // System.out.println(sum(3, 6, 6));
        System.out.println(sum(5, 7));
        System.out.println(sum(5.25f, 6.25f));
        System.out.println(isprime());
        
    }
    
}

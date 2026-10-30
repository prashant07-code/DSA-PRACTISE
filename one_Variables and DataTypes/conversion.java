import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        int a = 25;
        double b = a;
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        double d = sc.nextInt();
        
       /*  // but this is not possible
          int number = sc.nextFloat(); */


        System.out.println(number);
        System.out.println(d);

        
    }
    
}

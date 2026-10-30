import java.util.*;
public class practice {
    public static int sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        calculateSum();
        
         
        
    }
        
    }
    


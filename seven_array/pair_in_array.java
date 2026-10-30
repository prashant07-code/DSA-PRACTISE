import java.util.*;
public class pair_in_array {
    public static void print_pairs(int num[]){
        int tp=0; // tp= total pairs
        int n= num.length;
        for(int i=0; i<n; i++){
            int curr= num[i]; // 2,4,6,8,10
            for(int j= i+1; j<n; j++){
                System.out.print("(" + curr + "," + num[j] + ")");
              tp++;
            }
            System.out.println();
        }
        System.out.print("total pairs = "+ tp);
    }
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        print_pairs(num);
    }
    
}

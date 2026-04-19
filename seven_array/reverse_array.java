import java.util.*;
public class reverse_array {
    public static void reverse(int number[]){
        int first = 0,  last = number.length-1;
        while(first<last){
            //swap
        int temp = number[last];
        number[last] = number[first];
        number[first] = temp;
        first++;
        last--;

        }

}


    public static void main(String[] args) {
        int number[] = {5,7,12,8,10,14};
        reverse(number);
        for(int i=0; i<number.length;i++){
            System.out.print(number[i] + " ");
        }

        
    }
    
}

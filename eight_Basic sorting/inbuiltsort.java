import java.util.Arrays; 
public class inbuiltsort {
    public static void main(String[] args) {
        int arr [] = { 5,4,1,3,2};
        Arrays.sort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// for decending order sorting
/*import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {
    public static void main(String[] args) {
        Integer arr [] = { 5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder());
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}*/
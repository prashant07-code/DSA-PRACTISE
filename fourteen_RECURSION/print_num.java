package fourteen_RECURSION;

// public class print_num {
//     public static void printdec(int n){
//         if(n==1){
//             System.out.println(n);              // decending order
//             return;
//         }
//              System.out.println(n +" ");
//              printdec(n-1);
//     }
//     public static void main(String[] args) {
//         int n =10;
//         printdec(n);
//     }
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public class print_num {
    public static void printass(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
             printass(n-1);
             System.out.println(n +" ");
    }
    public static void main(String[] args) {
        int n =10;
        printass(n);
    }
}
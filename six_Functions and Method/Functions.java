

 
 public class Functions {


    


   /*  //1. function wwithout parameters.
    public static void printhelloworld(){
        System.out.println("hello world");
         System.out.println("hello world");
          System.out.println("hello world");
          return;


    } */

      /*   // 2. 
          public static void calculatesum(){
              Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);

          }  */


        /*    // 3.swap by function
        public static void swap(int a, int b ){
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a : " + a );
            System.out.println("a : " + b);
 }*/ 

         /*  // 4. product by function.
              public static int multiply(int a, int b){
                int product = a*b;
                return product;
            } */



                // 5.factorial of a number,n by function.
                public static int factorial(int n){
                  int  f = 1;
                  for(int i = 1; i <= n; i++ ){
                    f = f*i;
                  }
                  return f;
                } 


                  // 6.Binomial coefficient by function.
                      public static int bincoeff(int n, int r){
                    
                     int fact_n = factorial(n);
                     int fact_r = factorial(r);
                     int fact_nmr = factorial(n-r);

                     int bincoeff = fact_n / (fact_r * fact_nmr);
                     return bincoeff;
                      } 


 



    public static void main(String[] args) {
        //printhelloworld();
      //  calculatesum();
       //Scanner sc = new Scanner(System.in);
       System.out.println(bincoeff(10,5));
    
      
      /*  int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println(prod);  */
    


      /*int a = 10;
      int b = 5;
      swap(a, b); */


        
    }
    
}

public class isprime {



   //1. check if a number is prime or not?
    public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }  


        // 2.print all primes in a range.
        public static void primeInRange(int n){
            for(int i=2; i<=n; i++){
                if(isprime(i)){ // if true
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }



    public static void main(String[] args) {
       // System.out.println(isprime(50));
       primeInRange(50);
        
    }
    
}

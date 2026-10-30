public class pairs {
    public static void pair(int number[]){
        int total = 0;
        for(int i = 0; i<number.length; i++){
            int curr = number[i];
            for(int j = i+1; j<number.length; j++){
                System.out.print("(" + curr + "," + number[j] + ")");
                total++;
            }
           System.out.println();
        }
         System.out.println("total pairs : " + total);

    }
    public static void main(String[] args) {
        int number[] = {4,6,8,12,56,86};
        pair(number);
        

        
    }
    
}

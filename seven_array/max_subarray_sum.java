public class max_subarray_sum {
    public static void max_subarray_sum3_kadanes_algo(int num[]){
         int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i<num.length; i++){
            cs = cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
            }
            System.out.println("max sum is :  "+ms);
    
        }
        public static void main(String[] args) {
            int num [] = {-2,-3,4,-1,-2,1,5,-3};
            max_subarray_sum3_kadanes_algo(num);
        }
    }



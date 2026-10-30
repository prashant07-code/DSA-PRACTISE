public class prefix_sum {
    public static void max_subarray_2(int num[]){
        int n= num.length;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[]= new int [n];
        prefix[0]=num[0];
        // calculate prefix array
        for(int i =1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+num[i];
        }
        for(int i = 0; i<n; i++){
            int start = i;
            for(int j = i; j<n; j++){
                int end = j;
                currsum = start==0? prefix[end]:
              prefix[end]-prefix[start-1];
              if(maxsum<currsum){
                maxsum= currsum;
              }
            }
        }
        System.out.println("maxsum = "+ maxsum);
    }
    public static void main(String[] args) {
        int num []= {1,-2,6,-1,3};
        max_subarray_2(num);
    }
}

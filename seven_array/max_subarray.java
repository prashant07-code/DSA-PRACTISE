public class max_subarray {
    public static void max_subarraysum(int num[]){
        int currsum = 0;
        int maxsum= Integer.MIN_VALUE;
        int n = num.length;
        for(int i = 0; i<n; i++){
            int start = i;
            for (int j = i; j<n; j++){
                int end = j;
                currsum = 0;
                for(int k= start; k<=end; k++){
                    // print subarray sum
                    currsum = currsum + num[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum= currsum;
                }
            }
        }
        System.out.println("maxsum = "+ maxsum);

    }
    public static void main(String[] args) {
        int num []= {4,5,8,3};
        max_subarraysum(num);
    }
}

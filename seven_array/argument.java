public class argument {
    public static void update(int marks[], int nonchangable){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
       int marks[] = {56,57,58};
       int nonchangable = 5;
       update(marks, nonchangable);
       System.out.println(nonchangable);

       // print our marks.
       for(int i = 0; i<marks.length; i++){
        System.out.print(marks[i] + " ");


       }
       System.out.println();

        
    }

    
}

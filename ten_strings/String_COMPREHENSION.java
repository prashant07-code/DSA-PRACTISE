public class String_COMPREHENSION {
    public static String cmpstr(String str){
        String newstr = " ";
        // abc 
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1) ){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        } 
        return newstr;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(cmpstr(str));
    }
}

public class isSTRING_PALINDROME {
    public static boolean isSTRING_PALINDROME(String str){
       int n = str.length();
        for(int i=0; i<n/2; i++){
  if(str.charAt(i)!= str.charAt(n-1-i)){
    // not palindrome
    return false;
  }
  }
    
    return true;
}
public static void main(String[] args) {
    String str = "race car";
    System.out.println(isSTRING_PALINDROME(str));
}
}

// output false because ->> "race car" has a space, and the space is also considered a character in palindrome checking.
// for true output remove space ->> str = str.replace(" ", ""); ->> space remove

/*
public class isSTRING_PALINDROME {
    public static boolean isSTRING_PALINDROME(String str){
        str = str.replace(" ", "");  // space remove
        int n = str.length();

        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "race car";
        System.out.println(isSTRING_PALINDROME(str));
    }
}*/
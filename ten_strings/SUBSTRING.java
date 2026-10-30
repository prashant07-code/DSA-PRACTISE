public class SUBSTRING {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for( int i = si; i<ei; i++){
            substr+=str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "hello word";
        System.out.println(subString(str, 0, 5));
        System.out.println("iam printed by inbuilt substring function ->> " + str.substring(0,5));// substring inbuilt function
    }
}

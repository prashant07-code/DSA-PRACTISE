
package fourteen_RECURSION;

public class remove_duplicates {

    public static void duplicates(String str, int idx, StringBuilder sb, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char current = str.charAt(idx);

        if (map[current - 'a'] == true) {
            // Duplicate exists
            duplicates(str, idx + 1, sb, map);
        } 
        else {
            // Character is not duplicate
            map[current - 'a'] = true;
            sb.append(current);

            duplicates(str, idx + 1, sb, map);
        }
    }

    public static void main(String[] args) {

        String str = "prashant";

        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder();

        duplicates(str, 0, sb, map);
    }
}

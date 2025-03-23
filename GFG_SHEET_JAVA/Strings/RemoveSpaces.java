package GFG_SHEET_JAVA.Strings;

public class RemoveSpaces {
    public static String remove(String str) {
        str=str.replaceAll("\\s", "");
        return str;
    }
    public static void main(String args[] ) {
        String str="g eeks for ge eeks ";
        System.out.println(remove(str));
    }
}

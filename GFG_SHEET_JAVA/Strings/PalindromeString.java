package GFG_SHEET_JAVA.Strings;

public class PalindromeString {
    public static boolean check(String str) {
        str=str.toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--) {
            rev+=str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String args[]) {
        String str="level";
        boolean res=check(str);

        if(res) {
            System.out.println("Palindrome exists");
        }
        else {
            System.out.println("Palindrome doesnt exists");
        }
    }
}

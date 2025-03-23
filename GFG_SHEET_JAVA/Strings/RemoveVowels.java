package GFG_SHEET_JAVA.Strings;

import java.util.Scanner;

public class RemoveVowels {
        public static String remove(String s) {
            StringBuilder res=new StringBuilder();
            for(char ch:s.toCharArray()) {
                if("aeiouAEIOU".indexOf(ch) == -1) {
                    res.append(ch);
                }
            }
            return res.toString();
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(remove(S));
        }
}

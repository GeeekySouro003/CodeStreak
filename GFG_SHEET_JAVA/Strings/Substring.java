package GFG_SHEET_JAVA.Strings;

public record Substring() {
    public static void main(String args[]) {
        String txt="geeksforgeeks";
        String pat="eks";
        int count=txt.indexOf(pat);
        if(count!=-1)
        System.out.println(count);
        else
        System.out.println(-1);
    }
}

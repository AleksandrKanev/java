package home_work_2;

public class hw_3 {
    public static void main(String[] args) {
        String s = "Я им - их манеж. Отчим, и что же нам? Химия.";
        System.out.println(pol(s));
    }
    public static boolean pol(String txt) {
        StringBuilder sb = new StringBuilder(txt.replaceAll("[,-.?!]", "").replace(" ", "").toLowerCase());
        String sb1 = new String(sb);
        // System.out.println(sb);
        StringBuilder new_sb = new StringBuilder(sb.reverse());
        // String sb1 = new String(sb);
        String sb2 = new String(new_sb);
        // System.out.println(sb1);
        // System.out.println(sb2);
        boolean c = sb1.equals(sb2);
        return c;    
        
    }
}

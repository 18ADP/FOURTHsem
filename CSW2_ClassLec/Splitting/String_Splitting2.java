package Splitting;

public class String_Splitting2 {
    public static void main(String[] args) {
        java.lang.String my_str="WOrd@hello@bye@are@yjj@ad@";
        //String regex="@";
        java.lang.String[] piece_arr=my_str.split("@", 3);
        for (java.lang.String a : piece_arr) {
            System.out.println(a);
        }
    }
    
}
/*Output:
WOrd
hello
bye
 */
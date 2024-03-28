package Splitting;
public class String_Splitting{

    public static void main(String args[]){
     java.lang.String my_str="WOrd@hello@bye";
     java.lang.String regex="@";
     java.lang.String[] split=my_str.split(regex);
     for (java.lang.String a: split) {
        System.out.println(a);
     }  
    }
}
/*Output:
WOrd
hello
bye
 */
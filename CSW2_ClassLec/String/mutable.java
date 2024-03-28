package String;

public class mutable {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Hello");
        s=s.append("you");
        System.out.println(s);
        StringBuilder a=new StringBuilder("Hi");
        a=a.append("Adarsh");
        System.out.println(a);
    }
    
}
/*Output:
Helloyou
HiAdarsh
 */

package Concatenation;
//Using (+) operator.
public class StringConcatenation{
    public static void main(String args[]){
        String s1,s2,s3;
        s1="Hello";
        s2="to me"   ;
        s3=s1+" "+s2;
        System.out.println(s3);
        
        System.out.println("---------------------------------------");
          int a3;
          String a1,a2;
          a1="Hello";
          a2="number";
          a3=18;
          System.out.println(a1+" "+a2+" "+a3);
          System.out.println("--------------------------------------");

//Using [concat()] method.
        String r1="Kenta";
        r1=r1.concat("achu");
        System.out.println(r1);
        System.out.println("--------------------------------------");
        
        
        String r2="achu ?";
        String r3="tui";
        r3=r3.concat(r2);
        System.out.println(r3);
        System.out.println("--------------------------------------");

        String r4=r3.concat(r2);
        System.out.println(r4);
        System.out.println("--------------------------------------");
    }
}
/*Output:
Hello to me
---------------------------------------
Hello number 18
--------------------------------------
Kentaachu
--------------------------------------
tuiachu ?
--------------------------------------
tuiachu ?achu ?
-------------------------------------- */
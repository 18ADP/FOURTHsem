public class Concat1 {
    public static void main(String args[]){
        String s1="Hello", s2="";
        String s3=s1.concat(s2);
        System.out.println("Case1--concat()");
        if (s1==s3) {
            System.out.println("both are same.");  
        }else{
            System.out.println("Not same.");
        }
        System.out.println("Case2-- '+' ");
        String s4=s1+s2;
        if(s1==s4){
            System.out.println("both are same.");  
        }else{
            System.out.println("Not same.");
        }
    }
}
/*Output:
Case1--concat()
both are same.
Case2-- '+' 
Not same. */
package Polymorphism;
class sum{
static int add(int a,int b) {
	return a+b;
	
   }
static int add(int a,int b, int c) {
	return a+b+c;
	
   }
}

public class Overload {
	public static void main(String args[]) {
		System.out.println(sum.add(1 , 1));
		System.out.println(sum.add(1, 1, 1));
	}

}

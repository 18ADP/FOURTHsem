package oops;
class animal{
	void eat() {
		System.out.println("Eating");
	}
	
}
class dog extends animal{
	void eat() {
		System.out.println("Dog eating");
	}
}
public class Overriding {
	public static void main (String args[]) {
		animal a=new dog();
		a.eat();
	}

}

package Interface;
interface Myinter1{
	public void method1();
}
interface Myinter2{
	public void method2();
}
class democlass implements Myinter1,Myinter2{
	public void method1() {
		System.out.println("My method 1");
		
	}
	public void method2() {
		System.out.println("My method 2");
	}
}
public class Interface {
   
	public static void main(String[] args) {
		democlass myObj =new democlass();
		myObj.method1();
		myObj.method2();

	}

}

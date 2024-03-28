package Interface;
interface stand{
	public void method1();
}
interface walk{
	public void method2();
}
interface run{
	public void method3();
}
class Person implements stand,walk,run{
	public void method1() {
		System.out.println("Standing");
	}
	public void method2() {
		System.out.println("Walking");
	}
	public void method3() {
		System.out.println("Running");
	}
}
public class Q2interface {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.method1();
		obj.method2();
		obj.method3();
		// TODO Auto-generated method stub

	}

}

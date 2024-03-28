//overriding
package Polymorphism;
class cars{
	void run() {
		System.out.println("Running");
	}
}
class ford extends cars{
	void run() {
		System.out.println("Running at 60kmph");
	}
}
public class Run_Time_Polymorphism {

	public static void main(String[] args) {
		cars c=new ford();
		c.run();

	}

}

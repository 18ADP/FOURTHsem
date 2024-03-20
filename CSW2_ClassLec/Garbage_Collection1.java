package oops;
class Employee{
	private int ID;
	private String name;
	private int age;
	private static int nextId=1;
	public Employee(String name, int age) {
		this.name=name;
		this .age=age;
		this.ID=nextId++;
	}
	public void show() {
		System.out.println("Id= "+ID+"\nName= "+name+ "\nAge= "+age);
	}
	public void shownextId() {
		System.out.println("Next employee id will be= "+ nextId);
	}
}
public class Garbage_Collection1 {

	public static void main(String[] args) {
		Employee E=new Employee("Raghu",56);
		Employee F=new Employee("Faghu",46);
		Employee G=new Employee("Maghu",36);
		E.show();
		F.show();
		G.show();
		E.shownextId();
		F.shownextId();
		G.shownextId();
		{
			Employee X=new Employee("Jaggu",16);
			Employee Y=new Employee("Chuggu",26);
			X.show();
			Y.show();
			X.shownextId();
			Y.shownextId();
		}
		E.shownextId();
		// TODO Auto-generated method stub

	}

}
//OUTPUT:
//Name= Jaggu
//Age= 16
//Id= 5
//Name= Chuggu
//Age= 26
//Next employee id will be= 6
//Next employee id will be= 6
//Next employee id will be= 6


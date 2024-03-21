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
		System.out.println("Id= "+ ID +"\nName= "+ name + "\nAge= "+ age );
	}
	public void shownextId() {
		System.out.println("Next employee id will be= "+ nextId);
	}
}
public class NotSo_Garbage_Collection {

	public static void main(String[] args) {
		Employee E=new Employee("Raghu",56);
		E.show();
		E.shownextId();
		Employee F=new Employee("Faghu",46);
		F.show();
		F.shownextId();
		Employee G=new Employee("Maghu",36);
		G.show();
		G.shownextId();
		{
			Employee X=new Employee("Jaggu",16);
			X.show();
			X.shownextId();
			Employee Y=new Employee("Chuggu",26);
			Y.show();
			Y.shownextId();
		}
		E.shownextId();
		// TODO Auto-generated method stub

	}

}
//OUTPUT:
//Id= 1
//Name= Raghu
//Age= 56
//Next employee id will be= 2
//Id= 2
//Name= Faghu
//Age= 46
//Next employee id will be= 3
//Id= 3
//Name= Maghu
//Age= 36
//Next employee id will be= 4
//Id= 4
//Name= Jaggu
//Age= 16
//Next employee id will be= 5
//Id= 5
//Name= Chuggu
//Age= 26
//Next employee id will be= 6
//Next employee id will be= 6

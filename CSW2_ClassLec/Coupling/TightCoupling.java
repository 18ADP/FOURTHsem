package Coupling;
class A{
	public String name;
	public String getname() {
		if (name!=null)
			return name;
		else 
			return "not initialised";
	}

public void SetName(String Name) {
	if(Name==null)
		System.out.println("You cant initialize name to a null");
	else
		name=Name;
}
public static class TightCoupling {

	public static void main(String[] args) {
		A obj=new A();
		obj.name=null
				
				;
		System.out.println("Name is "+ obj.name);
	}
	

	}

}

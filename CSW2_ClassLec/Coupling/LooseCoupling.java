package Coupling;
class B{
private String name;
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
public static class LooseCoupling {

	public static void main(String[] args) {
		B obj=new B();
		obj.SetName(null);
		System.out.println("Name is "+obj.getname());


	}

}
}

package oops;
class bank{
	float getRateofInterest() {
		return 0;
	}
}
class SBI extends bank{
	float getRateofInterest() {
		return 7.3f;
	}
}
class HDFC extends bank{
	float getRateofInterest() {
		return 7.1f;
	}
}
class IDFC extends bank{
	float getRateofInterest() {
		return 7.2f;
	}
}


public class polymorphism_runtime {

	public static void main(String[] args) {
		bank a=new SBI();
		System.out.println(a.getRateofInterest());
		bank b=new HDFC();
		System.out.println(b.getRateofInterest());
		bank c=new IDFC();
		System.out.println(c.getRateofInterest());
	}

}

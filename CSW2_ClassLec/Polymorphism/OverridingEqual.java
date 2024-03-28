package Polymorphism;
class complex2{
	private double re,im;
	public complex2(double re, double im) {
		this.re=re;
		this.im=im;
    }
}
public class OverridingEqual {

	public static void main(String[] args) {
		complex2 c1=new complex2(10.7,2.2);
		complex2 c2=new complex2(10.7,2.2);
		if(c1==c2)
		    System.out.println("equal");
		else
			System.out.println("not equal");// TODO Auto-generated method stub

	}

}

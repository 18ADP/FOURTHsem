package Polymorphism;

public class StringOverriding {

	public static void main(String[] args) {
		complex c1=new  complex(10,15);
		System.out.println(c1);
		// TODO Auto-generated method stub

	}

}
class complex{
	private double re,im;
	public complex(double re, double im) {
		this.re=re;
		this.im=im;
	}
	//Getters
	public double getReal() {
		return this.re;
	}
	public double getImaginary() {
		return this.im;
	}
	public double setReal(double re) {
		return this.re;
	}
	public double setImaginary(double im) {
		return this.im;
	}
	//Overriding the method
	public String StringOverriding() {
		return this.re + "+" + this.im + "i";
	}
}

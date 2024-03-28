package Polymorphism;

class Multiply {
	static int mult(int a, int b) {
		return a * b;
	}

	static int mult(int a, int b, int c) {
		return a * b * c;
	}
}

public class COMPILE_TIME_MORPHISM {

	public static void main(String[] args) {
		System.out.println(Multiply.mult(2, 5));
		System.out.println(Multiply.mult(2, 5, 7));

	}

}

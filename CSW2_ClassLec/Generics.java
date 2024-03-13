package oops;
class MyGen<T>{
	T obj;
	void add(T obj)
	{this.obj=obj;}
	T get()
	{return obj;}
}
public class Generics {

	public static void main(String[] args) {
		MyGen<Integer> m=new MyGen<Integer>();
		m.add(2);
		//m.add("abc");  //COMPILE TIME ERROR
		System.out.println(m.get());
		// TODO Auto-generated method stub

	}

}

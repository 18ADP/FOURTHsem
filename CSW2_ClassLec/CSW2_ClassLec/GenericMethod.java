package CSW2_ClassLec;

public class GenericMethod {
	public static <E>void PrintArray(E[]elements){
		for(E element: elements) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Integer[] intArr= {10,20,30,40,50};
		Character[] charArr= {'A','B','C','D','E'};
		PrintArray(intArr);
		PrintArray(charArr);
				
				
		// TODO Auto-generated method stub

	}

}

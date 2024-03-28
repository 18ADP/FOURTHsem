package TryCatch;

public class Try_Catch_Finally3 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try {
			int i=arr[3];
			System.out.println("Inside try block.");
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Exception caught in catch block.");
		}
		System.out.println("Outside try catch clause");
		
		System.out.println("-----------------------------------------");
		// TODO Auto-generated method stub

	}

}

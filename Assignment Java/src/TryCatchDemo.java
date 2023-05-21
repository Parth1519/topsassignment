public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
		 {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[3]);
		 }
		 catch (Exception e)
		 {
		      System.out.println("Something went wrong.");
		 }
	}
}
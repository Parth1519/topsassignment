public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,fact=1;  
	    int number=5;   
	    for(f=1;f<=number;f++)
	    {
	      fact=fact*f;
	    }
	    System.out.println("Factorial of "+number+" is: "+fact);
	}
}
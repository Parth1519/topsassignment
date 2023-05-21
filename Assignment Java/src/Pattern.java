public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1
		12
		123
		1234
		12345
		*/
		for (int i=1; i<=5; i++) 
		{
			for (int j=1; j<=i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("******************");
		/*
		    *
		  * * *
		* * * * *
		  * * *
		    *
		*/
		int size = 3;
		for (int r = 1; r <= size; r++)
		{ 
			for (int q = size; q > r; q--)
			{
				System.out.print(" ");
			}   
			for (int p = 0; p < r * 2 - 1; p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int r = 1; r <= size - 1; r++)
		{
			for (int q = 0; q < r; q++)
			{
				System.out.print(" ");
			}
			for (int p = (size - r) * 2 - 1; p > 0; p--)
			{
				System.out.print("*");
			}
				System.out.println();
		}
		System.out.println("******************");
		/*
	   	1
		10
		101
		1010
		10101
	    */
		for (int i=1; i<=5; i++) 
		{
			for (int j=1; j<=i; j++) 
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
		System.out.println("******************");
		/*
			1
 		   2 2 
          3 3 3
         4 4 4 4
		*/         
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
	}
}
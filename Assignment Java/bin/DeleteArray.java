import java.util.Scanner;
public class DeleteArray
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();
        
        Integer arr[]=new Integer[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int elem = sc.nextInt();
    
        for(int i = 0; i < arr.length; i++)
        {
        	if(arr[i] == elem)
        	{
        		for(int j = i; j < arr.length - 1; j++)
        	{
        			arr[j] = arr[j+1];
        	}
        		break;
        	}
        }
        System.out.println("Elements after deletion " );
        for(int i = 0; i < arr.length-1; i++)
        {
             System.out.print(arr[i]+ " ");
        }
        sc.close();
	}
}
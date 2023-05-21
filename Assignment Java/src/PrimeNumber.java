public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,num=0,n=3;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime number");
					num=1;
				}
			}
			if(num==0)
			{
				System.out.println(n+" is prime number");
			}
		}
	}
}
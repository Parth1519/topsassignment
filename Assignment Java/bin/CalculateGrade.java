import java.util.Scanner;
public class CalculateGrade
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner sc = new Scanner(System.in);
        
        for(i=0; i<6; i++)
        {
           System.out.print("Enter Marks of Subject"+" "+(i+1)+":");
           marks[i] = sc.nextInt();
           total = total + marks[i];
        }
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=91 && avg<=100)
        {
            System.out.print("AA");
        }
        else if(avg>=81 && avg<=90)
        {
           System.out.print("AB");
        } 
        else if(avg>=71 && avg<=80)
        {
            System.out.print("BB");
        }
        else if(avg>=61 && avg<=70)
        {
            System.out.print("BC");
        }
        else if(avg>=51 && avg<=60)
        {
            System.out.print("CD");
        }
        else if(avg>=41 && avg<=50)
        {
            System.out.print("DD");
        }
        else
        {
            System.out.print("Fail");
        }
        sc.close();
	}

}

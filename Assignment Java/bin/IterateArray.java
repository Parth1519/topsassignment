import java.util.ArrayList;
import java.util.Iterator;
public class IterateArray
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Apple");
	      aList.add("Mango");
	      aList.add("Guava");
	      aList.add("Orange");
	      aList.add("Peach");
	      System.out.println("The ArrayList elements are: ");
	      for (Iterator<String> iter = aList.iterator(); iter.hasNext();)
	      {
	         System.out.println(iter.next());
	      }
	}
}
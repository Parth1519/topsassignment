import java.util.ArrayList;
public class UpdateArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Google");
		names.add("Apple");
		names.add("Samsung");
		System.out.println("Before Updation Array Values : "+names);
		names.set(1, "Asus");
		System.out.println("Before Updation Array Values : "+names);
	}
}
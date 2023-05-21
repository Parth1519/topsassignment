public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = new String("parth");
        String string2 = new String("Parth");
        System.out.println("Simple String Comparing " + string1 + " and " + string2+ " : " + string1.equals(string2));
        System.out.println("Ignore Upper Case Comparing " + string1 + " and " + string2+ " : " + string1.equalsIgnoreCase(string2));
        System.out.println("Comparing " + string1 + " and " + string2+ " : " + string1.compareTo(string2));
	}
}
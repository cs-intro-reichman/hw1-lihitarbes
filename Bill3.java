// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int value = Integer.parseInt(args[3]);
		double price = Math.ceil((double)value/3);
		System.out.println("Dear " + name1 + ", " + name2 + ", " + name3 + " pay " + price + " each");
	     

	}
}

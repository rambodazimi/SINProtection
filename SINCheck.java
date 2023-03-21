
/**
 * 
 * @author rambodazimi
 *
 */
public class SINCheck {

	public static void main(String[] args) {

		// Testing the functions with different methods
		String str1 = "#89@854";
		String str2 = "985478125";
		String str3 = "452788110";

		System.out.println(Check(str1));
		System.out.println(Check(str2));
		System.out.println(Hash(str3));

		
	}
	
	// A static recursive method that determines whether or not the string sin only contains digits 0-9
	public static boolean Check(String sin) {
		if(sin == "") return true;
		else {
			if(sin.charAt(0) != '0' &&  sin.charAt(0) != '1' && sin.charAt(0) != '2' && sin.charAt(0) != '3' && sin.charAt(0) != '4' &&
					sin.charAt(0) != '5' && sin.charAt(0) != '6' && sin.charAt(0) != '7' && sin.charAt(0) != '8' && sin.charAt(0) != '9') {
				return false;
			} else {
				return Check(sin.substring(1));
			}
		}
	}
	
	// A static recursive method that returns the hash value (sum of all the digits) of the input sin string
	public static int Hash(String sin) {
		if(sin == "") return 0;
		else {
			if(sin.charAt(0) != '0' &&  sin.charAt(0) != '1' && sin.charAt(0) != '2' && sin.charAt(0) != '3' && sin.charAt(0) != '4' &&
					sin.charAt(0) != '5' && sin.charAt(0) != '6' && sin.charAt(0) != '7' && sin.charAt(0) != '8' && sin.charAt(0) != '9') {
				return 0;
			} else {
				return (Character.getNumericValue(sin.charAt(0)) + Hash(sin.substring(1)));
			}
		}
	}
}

/**
 * 
 */

/**
 * @author User
 *
 */
public class ContinueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "   This is my text   ";
		// text = text.trim(); // remove wide spaces
		String oldtext =  args[0];
		String replace =  args[1];
		
		System.out.println("Original Text: "+ text);
		System.out.println("Replaced Text: "+ text.trim().replace(oldtext, replace).toUpperCase());// can chain one method with another
	}

}

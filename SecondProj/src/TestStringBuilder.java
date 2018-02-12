/**
 * 
 */

/**
 * @author User
 *
 */
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder(args[0]);
		String constant = "Studying";
		// sb.append("I am Studying Java");
		System.out.println("Given String is : " + sb + " , with lenght :" + sb.length());

		System.out.println("First 3 character is : " + sb.substring(0, 3));
		System.out.println("Last 3 character is : " + sb.substring(sb.length()-3));
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Extract Studying and print  : " + sb.substring(startOfConstant , endOfConstant));

		// Insert <_space your name> after "am"
		// System.out.println(sb.indexOf("am"));
		sb.insert(sb.indexOf("am")+2, " Sham");
		sb.delete(sb.indexOf("am"), sb.indexOf("am")+3);
		System.out.println("After alter  : " + sb);
		System.out.println("reverse  : " + sb.reverse());
		
		StringBuilder sb2 = new StringBuilder(args[0]);
		System.out.println(sb == sb2);
		StringBuilder sb3 = (sb.insert((sb.indexOf("am")+2), "Sham"));
		System.out.println(sb == sb3);
		System.out.println("sb : "+ sb +"\nsb3 :" + sb3);
		
		sb = null;
		sb2= null;
		sb3= null;
		
		System.out.println("After null  : " + sb + sb2 + sb3);
	}

}

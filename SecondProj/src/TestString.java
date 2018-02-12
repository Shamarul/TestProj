
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int first = 1;
		int second = 2;
		int third = 3;
		String fourth = "C";
		String fifth = "C";
		String sixth = new String("C");
		
		if(fourth == fifth) {
			System.out.println("fourth and fitfh is same " + fourth.hashCode());
		} else {
			System.out.println("fourth and fitfh is NOT the same " + fourth.hashCode());
		}
		
		if(fourth == sixth) {
			System.out.println("fourth and sixth is same " + fourth);
		} else {
			System.out.println("fourth and sixth is NOT the same " + sixth.hashCode());
		} */
		
//		System.out.println("Now fourth is : "+ fourth);
//		
//		fourth = third + fourth;
//		System.out.println("Now fourth is : "+ fourth);
//		
//		fourth = second + fourth;
//		System.out.println("Now fourth is : "+ fourth);
//		
//		fourth = String.valueOf(first).concat(fourth);
//		// fourth = fourth + first;
//		System.out.println("Now fourth is : "+ fourth);
		
//		String sms = "Selamat Datang ke Malaysia!!";
//		System.out.println("SMS Size is : "+ sms.length());
//		System.out.println("The character at 10 position| 9 index is : "+ sms.charAt(9));
//		System.out.println("Index of the text ! : "+ sms.indexOf("!"));
//		System.out.println("Substring of 0-10 : "+ sms.substring(0,10) );
//		System.out.println("Lower : " + sms.toLowerCase());
//		System.out.println("Upper : " + sms.toUpperCase());
		
		String country = "Malaysia";
		
//		if(country.equals(args[0])){
		if(country.equalsIgnoreCase(args[0])){
			System.out.println("Country is Malaysia");
		} else {
			System.out.println("Country is NOT Malaysia but "+ args[0]);
		}
		
		String userCountry = args[0].toLowerCase();
		if(userCountry.startsWith("m")){
			System.out.println("Country "+ userCountry + " is Starting with m");
		} 
		if(userCountry.endsWith("a")) {
			System.out.println("Country "+ userCountry + " Ending with a");
		}
		
		if(userCountry.contains("al")){
			System.out.println("Country "+ userCountry + " has al");
		} 
		
	}

}

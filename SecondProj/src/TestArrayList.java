import java.util.ArrayList;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		
		
		for (String str:args) {
			al.add(str);
		}
		System.out.println(al);
		System.out.println("Array list is empty : "+ al.isEmpty());
		System.out.println("Array list size : "+ al.size());
//		al.add(new Integer(10));
//		al.add(Boolean.TRUE);
		al.remove("two");
		al.set(1, "New");
		
		System.out.println("Now :" + al);
		
		System.out.println("Contains four : " + al.contains("four"));
		al.clear();
		System.out.println("Now after clear :" + al);
		
//		Object ar [] = al.toArray();	
//		
//		System.out.println(ar);
	}

}

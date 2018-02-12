import java.util.Arrays;

/**
 * 
 */

/**
 * This class test Java Arrays
 * @author User
 *
 */
public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salaries[] = {2222,100,50,60,170,180,1,5,10};
	    Arrays.sort(salaries);
		System.out.println(Arrays.binarySearch(salaries, 100));
//		for(int x=0; x< salaries.length; x++) {
//			System.out.println("Salaries of "+ x +" is : " + salaries[x]);
//		}
		//int z=0;
		for (int y: salaries) {
			System.out.print(y +",");
			//z++;
		}
		
	}

}

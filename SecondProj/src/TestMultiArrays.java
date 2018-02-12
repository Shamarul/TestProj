import java.util.Arrays;

/**
 * 
 */

/**
 * This class test Java Arrays
 * @author User
 *
 */
public class TestMultiArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course_subjects[][] = new String [2][2];
		course_subjects[0][0] = "CS-Maths";
		course_subjects[0][1] = "CS-English";
		course_subjects[1][0] = "AC-Accounting";
		course_subjects[1][1] = "AC-Bahasa Melayu";
		
		String course_subjects2 [][] = {{"CS-Maths","CS-English"},{"AC-Accounting","AC-Bahasa Melayu"}};
		
		for (int i=0 ;i < course_subjects.length; i++) {
			for (int j=0;j < course_subjects[i].length; j++) {
				System.out.println("Course of " + i + " Subject of "+ j +" is "+ course_subjects[i][j]);
			}
		}
		
		// forEach multi array
		for (String [] courses:course_subjects) {
			for (String subject:courses) {
				System.out.println("Course and Subject of "+ subject);
			}
		}
		
//	    Arrays.sort(salaries);
//		System.out.println(Arrays.binarySearch(salaries, 100));
//		for(int x=0; x< salaries.length; x++) {
//			System.out.println("Salaries of "+ x +" is : " + salaries[x]);
//		}
		//int z=0;
//		for (int y: salaries) {
//			System.out.print(y +",");
//			//z++;
//		}
		
	}

}

/**
 * 
 */
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.time.
/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Date dt = new Date(); // Date class
		String currentDate = String.valueOf(dt.getDay());
		System.out.println("Current Date is : " + currentDate);
		System.out.println("Current Time is : " + dt.getTime());
		
		Calendar cal = Calendar.getInstance(); // Calendar class
		// cal.set(year, month, date, hourOfDay, minute, second);
		cal.set(Integer.parseInt(args[0]), (Integer.parseInt(args[1])+1), Integer.parseInt(args[2]),
				Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
		System.out.println("----------------------------------\n");
		String currentCalDate = cal.get(Calendar.DATE)+ "/" + (cal.get(Calendar.MONTH)-1) + "/" + cal.get(Calendar.YEAR) + " " + 
				cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND)+
				cal.get(Calendar.AM_PM)+ " " 
				+ cal.getTimeZone().getDisplayName();
		System.out.println("Current Date is : " + currentCalDate); */
		
		LocalDate ld = LocalDate.now();
		System.out.println("Current Date Before : "+ ld);
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String text = ld.format(formatter);
//		System.out.println("Current Date After format : "+ text);
//		LocalDate parsedDate = LocalDate.parse(args[0], formatter);
//		String fparsedDate = parsedDate.format(formatter);
//		System.out.println("Current Parse After format : "+ fparsedDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	}

}

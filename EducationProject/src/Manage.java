import java.util.*;
import java.sql.*;
import java.io.IOException;
/**
 * 
 */

/**
 * @author User
 *
 */
public class Manage {

	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/education";

	   //  Database credentials
	   static final String USER = "sham";
	   static final String PASS = "root";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		String tableName;
		int option=0;
		int run=0;
		Connection conn = null;
		Statement stmt = null;
		
		Scanner cin = new Scanner(System.in);
		Scanner nic = new Scanner(System.in);
		
		while (run==0) {	
		System.out.println("\n!! Welcome to Education Management System !!\n");
		
		System.out.println("What are you need to do(Enter ther number) ? ");
		System.out.println("1. View - View table value ");
		System.out.println("2. Insert - Insert new value ");
		System.out.println("3. Update - Update the table value ");
		System.out.println("4. Delete - Delete the table value ");
		System.out.print("Enter : ");
		choice = cin.nextLine();
		
		while (option==0) {
			if (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("view") ) {
				System.out.println("--------------------------------------- ");
				System.out.println("View Table Value");
				System.out.print("Select table name to view (Student/Class/Mark) :");
				option=1;
				tableName = cin.nextLine();
				// view
				try {
				      //STEP 2: Register JDBC driver
				      Class.forName("com.mysql.jdbc.Driver");

				      //STEP 3: Open a connection
				      System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				      System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				      System.out.println("Creating statement...");
				      stmt = conn.createStatement();

				      String sql = "SELECT * FROM "+ tableName;
				      ResultSet rs = stmt.executeQuery(sql);
				      //STEP 5: Extract data from result set
				      if (tableName.equalsIgnoreCase("Student")) {
				     
				    	  System.out.println("_____________________________________________________________");
					      System.out.println("|StudentId    | Age      | firstName   | lastName  | Gender  |");
					      System.out.println("--------------------------------------------------------------");
					      
				      while(rs.next()){
				         //Retrieve by column name
				         int StudentId  = rs.getInt("StudentId");
				         // int ClassId = rs.getInt("ClassId");
				         String firstName = rs.getString("firstName");
				         String lastName = rs.getString("lastName");
				         int age = rs.getInt("age");
				         String gender = rs.getString("gender");

				         //Display values
				         
				         System.out.println("|"+ StudentId +"            |"+ age +"        |"+ firstName +"          |"+ lastName +"   |"+ gender +"     |");
				         
				      	}
				      System.out.println("--------------------------------------------------------------");
				      } else if (tableName.equalsIgnoreCase("Class")) {
				    	  System.out.println("_______________________________");
					      System.out.println("|ClassId   | classCourse      |");
					      System.out.println("-------------------------------");
					      while(rs.next()){
					         //Retrieve by column name
					         int ClassId  = rs.getInt("ClassId");
					         String classCourse = rs.getString("classCourse");

					         //Display values
					         System.out.println("|"+ ClassId + "         |" + classCourse + "  |");
					         
					      }
					      System.out.println("-------------------------------");
					   } else if (tableName.equalsIgnoreCase("Mark")) {
						   System.out.println("_________________________");
						   System.out.println("StudentId   |  Mark     | ");
						   System.out.println("-----------------------");
						   
					      while(rs.next()){
					         //Retrieve by column name
					         int mark  = rs.getInt("mark");
					         int StudentId = rs.getInt("StudentId");

					         //Display values;
					         System.out.println(StudentId +"           |"+ mark+ "         |");
					      }  
					      System.out.println("-----------------------");
					   }
				      rs.close();
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				
			} else if (choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("Insert") ) {
				System.out.println("--------------------------------------- ");
				System.out.println("Insert new value ");
				System.out.println("Select Table to Insert their value (Student/Class/Mark) ");
				System.out.print("Enter : ");
				tableName = cin.nextLine();
			    option=1;
			    if (tableName.equalsIgnoreCase("Student")) {
			    	int StudentId;
			    	int ClassId;
			    	String firstName;
			    	String lastName;
			    	int age;
			    	String gender;
			    	
			    	System.out.println("Enter Details Below ..");
			    	System.out.print("Student ID : ");
			    	StudentId = cin.nextInt();
			    	System.out.print("Student's Class ID : ");
			    	ClassId = cin.nextInt();
			    	System.out.print("Student's First Name : ");
			    	firstName = nic.nextLine();
			    	System.out.print("Student's Last Name : ");
			    	lastName = nic.nextLine();
			    	System.out.print("Student's Age : ");
			    	age = cin.nextInt();
			    	System.out.print("Student's Gender : ");
			    	gender = nic.nextLine();
			    	
			    try{
			        //STEP 2: Register JDBC driver
			        Class.forName("com.mysql.jdbc.Driver");

			        //STEP 3: Open a connection
			        System.out.println("Connecting to a selected database...");
			        conn = DriverManager.getConnection(DB_URL, USER, PASS);
			        System.out.println("Connected database successfully...");
			        
			        //STEP 4: Execute a query
			        System.out.println("Inserting records into the table...");
			        stmt = conn.createStatement();
			        
			        String sql = "INSERT INTO " + tableName +
			                     " VALUES ("+StudentId+"," +ClassId+ ",'"+ firstName +"','"+ lastName + "',"+ age + ",'" +gender+ "')";
			        stmt.executeUpdate(sql);
			        System.out.println("Inserted records into the table...");

			     }catch(SQLException se){
			        //Handle errors for JDBC
			        se.printStackTrace();
			     }catch(Exception e){
			        //Handle errors for Class.forName
			        e.printStackTrace();
			     }finally{
			        //finally block used to close resources
			        try{
			           if(stmt!=null)
			              conn.close();
			        }catch(SQLException se){
			        }// do nothing
			        try{
			           if(conn!=null)
			              conn.close();
			        }catch(SQLException se){
			           se.printStackTrace();
			        }//end finally try
			     }//end try
			    } // end student if
			
			    else if (tableName.equalsIgnoreCase("Class")) {
			    	int ClassId;
			    	String classCourse;
			    	
			    	System.out.println("Enter Details Below ..");
			    	System.out.print("Class ID : ");
			    	ClassId = cin.nextInt();
			    	System.out.print("Enter Class Course : ");
			    	classCourse = nic.nextLine();
			    				    	
			    try{
			        //STEP 2: Register JDBC driver
			        Class.forName("com.mysql.jdbc.Driver");

			        //STEP 3: Open a connection
			        System.out.println("Connecting to a selected database...");
			        conn = DriverManager.getConnection(DB_URL, USER, PASS);
			        System.out.println("Connected database successfully...");
			        
			        //STEP 4: Execute a query
			        System.out.println("Inserting records into the table...");
			        stmt = conn.createStatement();
			        
			        String sql = "INSERT INTO " + tableName +
			                     " VALUES ("+ClassId+",'" +classCourse+ "')";
			        stmt.executeUpdate(sql);
			        System.out.println("Inserted records into the table...");

			     }catch(SQLException se){
			        //Handle errors for JDBC
			        se.printStackTrace();
			     }catch(Exception e){
			        //Handle errors for Class.forName
			        e.printStackTrace();
			     }finally{
			        //finally block used to close resources
			        try{
			           if(stmt!=null)
			              conn.close();
			        }catch(SQLException se){
			        }// do nothing
			        try{
			           if(conn!=null)
			              conn.close();
			        }catch(SQLException se){
			           se.printStackTrace();
			        }//end finally try
			     }//end try
			    } // end class if
			    
			    else if (tableName.equalsIgnoreCase("Mark")) {
			    	int StudentId;
			    	int mark;
			    	
			    	System.out.println("Enter Details Below ..");
			    	System.out.print("Enter Student Id  : ");
			    	StudentId = cin.nextInt();
			    	System.out.print("Enter Student's Mark : ");
			    	mark = cin.nextInt();
			    				    	
			    try{
			        //STEP 2: Register JDBC driver
			        Class.forName("com.mysql.jdbc.Driver");

			        //STEP 3: Open a connection
			        System.out.println("Connecting to a selected database...");
			        conn = DriverManager.getConnection(DB_URL, USER, PASS);
			        System.out.println("Connected database successfully...");
			        
			        //STEP 4: Execute a query
			        System.out.println("Inserting records into the table...");
			        stmt = conn.createStatement();
			        
			        String sql = "INSERT INTO " + tableName +
			                     " VALUES ("+mark+"," +StudentId+ ")";
			        stmt.executeUpdate(sql);
			        System.out.println("Inserted records into the table...");

			     }catch(SQLException se){
			        //Handle errors for JDBC
			        se.printStackTrace();
			     }catch(Exception e){
			        //Handle errors for Class.forName
			        e.printStackTrace();
			     }finally{
			        //finally block used to close resources
			        try{
			           if(stmt!=null)
			              conn.close();
			        }catch(SQLException se){
			        }// do nothing
			        try{
			           if(conn!=null)
			              conn.close();
			        }catch(SQLException se){
			           se.printStackTrace();
			        }//end finally try
			     }//end try
			    } // end class if
			} else if (choice.equalsIgnoreCase("3") || choice.equalsIgnoreCase("Update") ) {
				
				System.out.println("--------------------------------------- ");
				System.out.println("Eg:- UPDATE (tableName) SET (Field To Change) = (Value set to change) WHERE id in (Set id) ");
				System.out.println("--------------------------------------- ");
				System.out.println(" Update the table value ");
				System.out.print(" Pick the table that you want to update(tableName) :  ");
				tableName = cin.nextLine();
				
				if(tableName.equalsIgnoreCase("student")) {
					
					String field = null;
					String value = null;
					int id;
					System.out.println("--------------------------------------- ");
					System.out.print(" Pick the student's ID that you wished to Alter(Set id) :  ");
					id = nic.nextInt();
					System.out.print(" Pick the field that you want to change(Field to Change) :  ");
					field = cin.nextLine();
					System.out.print(" Alter with value(Value set to change) :  ");
					value = cin.nextLine();
					
					try{
					      //STEP 2: Register JDBC driver
					      Class.forName("com.mysql.jdbc.Driver");

					      //STEP 3: Open a connection
					      System.out.println("Connecting to a selected database...");
					      conn = DriverManager.getConnection(DB_URL, USER, PASS);
					      System.out.println("Connected database successfully...");
					      
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      stmt = conn.createStatement();
					      String sql = "UPDATE " + tableName +
					                   " SET "+ field + " = '" + value +"' WHERE StudentId in ("+id+")";
					
					      stmt.executeUpdate(sql);

					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            conn.close();
					      }catch(SQLException se){
					      }// do nothing
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
				} else if(tableName.equalsIgnoreCase("class")) {
					//String field = null;
					String value = null;
					int id;
					System.out.println("--------------------------------------- ");
					System.out.print(" Pick the Class's ID that you wished to Alter(Set id) :  ");
					id = nic.nextInt();
//					System.out.print(" Pick the field that you want to change(Field to Change) :  ");
//					field = cin.nextLine();
					System.out.print(" Alter with value(Value set to change) :  ");
					value = cin.nextLine();
					
					try{
					      //STEP 2: Register JDBC driver
					      Class.forName("com.mysql.jdbc.Driver");

					      //STEP 3: Open a connection
					      System.out.println("Connecting to a selected database...");
					      conn = DriverManager.getConnection(DB_URL, USER, PASS);
					      System.out.println("Connected database successfully...");
					      
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      stmt = conn.createStatement();
					      String sql = "UPDATE " + tableName +
					                   " SET classCourse = '" + value +"' WHERE 	ClassId in ("+id+")";
					
					      stmt.executeUpdate(sql);

					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            conn.close();
					      }catch(SQLException se){
					      }// do nothing
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
					
				} else if(tableName.equalsIgnoreCase("mark")) {
					//String field = null;
					String value = null;
					int id;
					System.out.println("--------------------------------------- ");
					System.out.print(" Pick the Student's ID that you wished to Alter(Set id) :  ");
					id = nic.nextInt();
//					System.out.print(" Pick the field that you want to change(Field to Change) :  ");
//					field = cin.nextLine();
					System.out.print(" Update the mark(Value set to change) :  ");
					value = cin.nextLine();
					
					try{
					      //STEP 2: Register JDBC driver
					      Class.forName("com.mysql.jdbc.Driver");

					      //STEP 3: Open a connection
					      System.out.println("Connecting to a selected database...");
					      conn = DriverManager.getConnection(DB_URL, USER, PASS);
					      System.out.println("Connected database successfully...");
					      
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      stmt = conn.createStatement();
					      String sql = "UPDATE " + tableName +
					                   " SET mark = '" + value +"' WHERE StudentId in ("+id+")";
					
					      stmt.executeUpdate(sql);

					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            conn.close();
					      }catch(SQLException se){
					      }// do nothing
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
					
				} else {
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
					System.out.println("Table did not exist. Table may exist - (Student/Class/Mark)");
					System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
				}
				
				option=1;
			
			} else if (choice.equalsIgnoreCase("4") || choice.equalsIgnoreCase("Delete") ) {
				
				int id;
				
				System.out.println("--------------------------------------- ");
				System.out.println(" Delete the table value ");
				System.out.print(" Select table that you want to delete from : ");
				tableName = cin.nextLine();
				System.out.print(" Select the ID that you want to delete : ");
				id = nic.nextInt();
				
				if (tableName.equalsIgnoreCase("student")) {
					try{
					      //STEP 2: Register JDBC driver
					      Class.forName("com.mysql.jdbc.Driver");

					      //STEP 3: Open a connection
					      System.out.println("Connecting to a selected database...");
					      conn = DriverManager.getConnection(DB_URL, USER, PASS);
					      System.out.println("Connected database successfully...");
					      
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      stmt = conn.createStatement();
					      String sql = "DELETE FROM " + tableName +
					                   " WHERE StudentId = "+ id;
					      stmt.executeUpdate(sql);
					      
					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            conn.close();
					      }catch(SQLException se){
					      }// do nothing
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
				} else if (tableName.equalsIgnoreCase("class")) {
					try{
					      //STEP 2: Register JDBC driver
					      Class.forName("com.mysql.jdbc.Driver");

					      //STEP 3: Open a connection
					      System.out.println("Connecting to a selected database...");
					      conn = DriverManager.getConnection(DB_URL, USER, PASS);
					      System.out.println("Connected database successfully...");
					      
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      stmt = conn.createStatement();
					      String sql = "DELETE FROM " + tableName +
					                   " WHERE ClassId = "+ id;
					      stmt.executeUpdate(sql);
					      
					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            conn.close();
					      }catch(SQLException se){
					      }// do nothing
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
				} else if (tableName.equalsIgnoreCase("mark")) {
					try{
					      //STEP 2: Register JDBC driver
					      Class.forName("com.mysql.jdbc.Driver");

					      //STEP 3: Open a connection
					      System.out.println("Connecting to a selected database...");
					      conn = DriverManager.getConnection(DB_URL, USER, PASS);
					      System.out.println("Connected database successfully...");
					      
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      stmt = conn.createStatement();
					      String sql = "DELETE FROM " + tableName +
					                   " WHERE StudentId = "+ id;
					      stmt.executeUpdate(sql);
					      
					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            conn.close();
					      }catch(SQLException se){
					      }// do nothing
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
				}
				
				option=1;
			
			}else if (choice.equalsIgnoreCase("h") || choice.equalsIgnoreCase("help") ) {
				System.out.println("--------------------------------------- ");
				System.out.println("1. View - View table value ");
				System.out.println("2. Insert - Insert new value ");
				System.out.println("3. Update - Update the table value ");
				System.out.println("4. Delete - Delete the table value ");
				System.out.print("Enter : ");
				choice = cin.nextLine();
			
			} else {
				System.out.println("--------------------------------------- ");
				System.out.println(" Invalid input Please Try Again . Enter h or Help for info");
				System.out.print("Enter : ");
				choice = cin.nextLine();
			}
		
		 }
		option=0;
		}
		
		}

}


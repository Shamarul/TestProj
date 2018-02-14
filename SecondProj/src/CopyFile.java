import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
//      FileInputStream in = null;
//      FileOutputStream out = null;
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
       System.out.print("Enter The file input Path : ");
       String inputFile=br.readLine();
       System.out.print("Enter the file output Path :");
       String outputFile=br.readLine();
	   
      FileReader in = null;
      FileWriter out = null;

      try {
         //in = new FileInputStream(".\\input.txt");
         
         //in = new FileInputStream("C:\\Training\\SAMPLES3\\input.txt");
         //out = new FileOutputStream("output.txt");
         
//    	 in = new FileReader("C:\\Training\\SAMPLES3\\input.txt");
//       out = new FileWriter("C:\\Training\\SAMPLES3\\output.txt");
    	  
    	  in = new FileReader(inputFile);
          out = new FileWriter(outputFile);
    	  
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         // System.out.println("File Okay !!");
         System.out.println("File Copied !!");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
// for Loop
// Program to print a sentence 10 times

class ForLoop {
   public static void main(String[] args) {
      
	  //String myVar = "Nothing";
	   
	  StringBuilder sb = new StringBuilder(10);
	  sb.append("Nothing");
	  System.out.println("sb: " +sb);
	  
      for (int i = 1; i <= 10; ++i) {
         System.out.println("sb  at Line " + i + " with value : " + sb);
         sb.append("-" + i);
      }
   }
}
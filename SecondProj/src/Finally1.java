class Finally1 {
   public static void main(String args[])
   {
      System.out.println(Finally1.myMethod());  
   }
   public static int myMethod() {
      try {
        return 112;
      }
      finally {
        System.out.println("This is Finally block");
        System.out.println("Finally block ran even after return statement");
      }
   }
}
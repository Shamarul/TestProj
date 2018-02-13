interface Modem {
	
  public String modemVersion = "V1"; 
  public boolean open();                               
  public boolean close();
  public int read ();
  public int write();
  
  public static String getMyName() {
	  return "Modem";
  }

}
 
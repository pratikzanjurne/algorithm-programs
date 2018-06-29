package magicno;

import com.bridgelabz.utility.Utility;

public class MagicNo 
{
  public static void main(String args[])
  {
	  int number;
	  boolean value;
	  Utility u= new  Utility();
	  System.out.println("Enter the no that must be 2^n");
	  number=u.getnumber();
	  u.mogicnumber(number);
  }
}

package binaryno;

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args)
	{
	   int a;
	   Utility u=new Utility();
	   System.out.println("Enter integer number");
	   a=u.getnumber();
	   String f=u.toBinary(a);
	   int y= Integer.parseInt(f);
	   System.out.println(y);
	  int z=u.swapnibbles(y);
	   String m=u.toBinary(z);
	  System.out.println(z);
	}

}

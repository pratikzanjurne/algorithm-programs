package binary;

import com.bridgelabz.utility.Utility;

public class DectoBin 
{
 public static void main(String args[])
 {
	int n;
	Utility u=new Utility();
	System.out.println("Enter the Decimal no to convert in binary");
	n=u.getnumber();
	String ans=u.toBinary(n);
	System.out.println("Binary no is= "+ans);
 }
}

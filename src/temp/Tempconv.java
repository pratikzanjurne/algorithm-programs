package temp;

import com.bridgelabz.utility.Utility;

public class Tempconv 
{
	public static void main(String args[])
	{
       int temp;
       Utility u= new Utility();
       System.out.println("Enter the tempreture");
       temp=u.getnumber();
       int txtemp=u.tempconv(temp);
       System.out.println("your temp is"+txtemp);

    }
}

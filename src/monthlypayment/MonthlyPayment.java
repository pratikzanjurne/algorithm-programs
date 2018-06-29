package monthlypayment;

import org.omg.Messaging.SyncScopeHelper;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment 
{
	public static void main(String args[])
	{
		double p,y,r;
		Utility u= new Utility();
		System.out.println("Enter the no of year's to pay off");
		y=u.getnumber();
		System.out.println("Enter the Principle loan amount");
		p=u.getnumber();
		System.out.println("Enter the no of percentage");
		r=u.getnumber();
		 u.calpayment(p,y,r);

	}

}

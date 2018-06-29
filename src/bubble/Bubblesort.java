package bubble;

import com.bridgelabz.utility.Utility;

public class Bubblesort 
{
	public static void main(String args[])
	{
		int arr[];
		Utility u=new Utility();
		System.out.println("Enter size of your array");
		int a=u.getnumber();
		arr=u.getArray(a);
		u.bubblesort(arr);
	}
}

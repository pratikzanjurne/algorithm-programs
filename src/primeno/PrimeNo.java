package primeno;
import com.bridgelabz.utility.Utility;

public class PrimeNo 
{
	public static void main(String args[])
	{
		int value;
		Utility u=new Utility();
		System.out.println("Prime numbers from 0-1000 are:");
		for(int i = 0;i<1000;i++)
		{ 
			int x=u.getprime(i);
			if(x!=0)
			{
				System.out.println(x);
			}
				
		}	
		
	}
}



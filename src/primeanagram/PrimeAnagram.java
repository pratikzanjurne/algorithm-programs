package primeanagram;
import com.bridgelabz.utility.Utility;

public class PrimeAnagram 
{
	public static void main(String args[])
	{
		int z=0;
		int value;
		int prime[] = new int[1000];
		Utility u=new Utility();
		System.out.println("Prime numbers from 0-1000 are:");
		for(int i = 0;i<1000;i++)
		{ 
			int x=u.getprime(i);
			if(x!=0)
			{
				
				prime[z]=x;
				System.out.println(prime[z]);
				z++;
				//System.out.println(prime.length);
		    }
		
		}
		
	}
}



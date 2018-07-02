package anagram;
import com.bridgelabz.utility.*;
import java.util.*;
class    Angaram
{
	public static void main( String  args[ ] )
	{
		String  	str1 , str2 ;
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string = ");			
		str1=sc.next();
		System.out.println("enter second string = ");			
		str2 = sc.next( );
		boolean value=u.chackAnageam(str1,str2);
		if(value==true )
		{
			System.out.println("Strings Are Anagram ");
		}
		else
		{
			System.out.println("Strings Are Not Anagram ");
		}
	}
}
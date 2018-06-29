package day;

import com.bridgelabz.utility.Utility;

public class Day 
{
   public static void main(String args[])
   {
	   int m,d,y;
	   Utility u=new Utility();
	   System.out.println("Enter date:");
	   d=u.getnumber();
	   System.out.println("Enter month:");
	   m=u.getnumber();
	   System.out.println("Enter year:");
	   y=u.getnumber();
	   int ans=u.DayOfWeek(d,m,y);
	   switch(ans)
	   {
	   case 1 : System.out.println("Monday");break;
	   case 2 : System.out.println("Tuesday");break;
	   case 3 : System.out.println("Wednesday");break;
	   case 4 : System.out.println("Thursday");break;
	   case 5 : System.out.println("Friday");break;
	   case 6 : System.out.println("Saturday");break;
	   case 7 : System.out.println("Sunday");break;
	   }
   }
}

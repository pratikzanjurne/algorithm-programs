package com.bridgelabz.utility;
import java.util.*;


public class Utility 
{   
	static Random rand = new Random();
	static Scanner sc=new Scanner(System.in);
	public static String ipstring() 
	{
		return sc.next();
	}
	public static int getnumber()
	{
		return sc.nextInt();
	}
	public static int getrandomInt()
	{
		return rand.nextInt();
	}
	public static double getrandomdouble()
	{
		return rand.nextDouble();
	}
	public static void rplcstring() 
	{
		String username="<user name>";
	    System.out.println("HEllo "+username+" ,How are you?"); 
		System.out.println("Enter username");
		String sc=ipstring();
	    username = username.replaceAll(username, sc);
		System.out.println("HEllo "+username+" ,How are you?");
			
	}
	public static void flipcoin(int number)
	{
		 int headcount=0,tailcount=0;
		 double per1,per2;
		 for(int i=0;i<number;i++)
		 {
		 double val=getrandomdouble();
		 if(val<0.5)
		 {
			 tailcount++;
		 }
		 else
			 headcount++;	
		 }
		 per1=(double)tailcount/number*100;
		 per2=(double)headcount/number*100;
		 System.out.println("Percentage of headount is "+per2);
		 System.out.println("percentage of tailcount is "+per1);
	}
	public static boolean leapyear(int year)
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					return true;
				}
				else
					return false;
			}
			else
			return true;
		}
		else
		return false;
	}
	public void power(int number)
	{
		int power=1;
		for(int i=1;i<=number;i++)
		{
			power=power*2;
			System.out.println("power 2^"+i+" = "+power);
		}
		
	}
	public void harmonic(int number) 
	{
		double answer=0;
		for(int i=1;i<=number;i++)
		{
			answer=answer+1.0/i;
		}
		System.out.println("Harmonic number of "+number+" is "+answer);
		
	}
	public void primefactors(int number) 
	{
		System.out.println("Prime factors are");
		int factor,n,j;
		for(int i=2;i<number;i++)
		{
			n=i;
			for(j=2;j<=n;j++)
			{
				if(n%j==0)
				{
					break;
				}
			}
			
			if(j==n);
			{
				if(number%n==0)
				{
					System.out.println(n);
				}
			}
		}
	}
	public int generatecoupon(int number) 
	{
			boolean[] isCollected=new boolean[number];
			int different=0;
			int count=0;
			while(different<number)
			{
				int value=(int)(Math.random()*number);
				count++;
				if(!isCollected[value])
				{
					different++;
					isCollected[value]=true;
				}
			
			}
		return count;
	}
	public int[] getArray(int n)
	{
		int Array[]=new int[n];
		System.out.println("enter your array");
		for(int i=0;i<n;i++)
		{
			
			Array[i]=getnumber();
		}
		return Array;
	}
	public static String[] getstring()
			{
				return null;
		
			}
	public void checksumzero(int Array[],int n)
	{
		int f=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(Array[i]+Array[j]+Array[k]==0)
					{
						System.out.println("Triplet is "+Array[i]+" "+Array[j]+" "+Array[k]);
						f++;
					}
					
						
					
				}
			}
		}
	if(f==0)
	{
		System.out.println("There are no Triplets of this array");
	}
	}
	public void getroots(int a, int b, int c) 
	{
		double delta=(b*b)-(4*a*c);
		int root1=(int) ((-b+Math.sqrt(delta))/2*a);
		int root2=(int) ((-b-Math.sqrt(delta))/2*a);
		System.out.println("Your first root is "+root1);
		System.out.println("Your second root is "+root2);
	}
	public double distance(int x, int y) 
	{
		int a;
		double dist;
		a=(int) (Math.pow(x, 2)+Math.pow(y, 2));
		dist=Math.sqrt(a);
		return dist;
	}
	public void windchill(int t, int v) 

	{
		 double x=Math.pow(v, 0.18);
		 double w =35.74+0.6215*t+(0.4275*t-35.75)*x;
		System.out.println(" "+w);
	}
	public void getprime() {
		int x;
		int i;
		for(i=0;i<1000;i++)
		{ 
		for(x=2;x<i;x++)
		{
			if(i%x==0)
			{
				break;
			}
		}
		if(i==x)
		{
			System.out.println(x);
		}
		}
		
	}
	public void mogicnumber(int number) 
	{
	int upper=number;
	int lower=0;
	int x=0;
	int middle=(upper+lower)/2;
	System.out.println("Is your no is "+middle);
	System.out.println("Always give answer Yes or Low or High");
	String result=ipstring();
    for(int i=0;i<number;i++)
    {
    	if(result.equals("high"))
    	{
    		lower=middle;
    		x++;
    	}
    	else if(result.equals("yes"))
    	{
    		System.out.println("Your no is middle");
    		x++;
    		break;
    	}
    	else if(result.equals("low"))
    	{
    		upper=middle;
    		x++;
    	}
    	while(x<number)
    	{
    		middle=(upper+lower)/2;
    		System.out.println("Is your number is "+middle+"?");
    		result=ipstring();
    		break;
    	}
    }
	
		
	}
	public void bubblesort(int[] arr) 
	{
		int i,j;
		int n=arr.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is = ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public String[] getString(int data) {
		String string[]=new String[data];
		System.out.println("enter your string");
		for(int i=0;i<data;i++)
		{
			
			string[i]=ipstring();
		}
		return string;
		
	}
	public String[] insertionsort(String[] input,int data) 
	{
		int i,j;
		String key;
		System.out.println(Arrays.toString(input));
	    for (j = 1; j < data; j++) {
	        key = input[j];
	        i = j - 1;
	        while (i >= 0) {
	            if (key.compareTo(input[i]) > 0) {
	                break;
	            }
	            input[i + 1] = input[i];
	            i--;
	        }
	        input[i + 1] = key;
	        System.out.println(Arrays.toString(input));
	    }
	    return input;
	}
	public int DayOfWeek(int d, int m, int y) 
	{
		
		double y0;
		double x;
		double m0;
		int d0;
		y0 = y-(1 -m) / 12;
		x = y0 + y0/4-y0/100 + y0/400;
		m0 = m+12*((14-m)/12)-2;
		d0 = (int) ((d + x + 31*m0/12)%7);
		System.out.print(d0+": ");
		return d0;
	}
	public int tempconv(int temp) 
	{
		int c;
		int F = 0;
	   System.out.println("Press 1 to convert into Celsius");
	   System.out.println("Press 2 to convert into Fahrenheit");
	   c=getnumber();
	   switch(c)
	   {
	   case 1:
	       F=(temp * 9/5)+32;
	   break;
	   case 2:
		   F=(temp - 32) * 5/9;
		   break;
	   default:
		   System.out.println("Enter the correct conditon");
	   }
		return F;
	}
	public void  calpayment(double p,double y,double r) 
	{
		double n,R;
		n=12*y;
		R=r/(12*100);
		double payment=((p*R)/(1-Math.pow((1+R), -n)));
		System.out.println("Total payment is : "+payment);
	}
	public void sqrt(double c) 
	{
	double t;
	t=c;
	t=((c/t)+t)/2;
	while(Math.abs(t-c/t)>1e-15*t) 
	{
		t=((c/t)+t)/2;	
	}
	System.out.println(t);
	}
	public String toBinary(int n) 
	{
		
		String x = "";
		String y="00000000";
		while(n>0)
		{
		int a=n%2;
		x= x + "" + a;
		n=n/2;
		}
		for(int i=x.length()-1;i>=0;i--)
        {
            y = y + x.charAt(i);
        }
		return y;
	}
	public int swapnibbles(int y) {
		
		return ((y & 0x0F)<<4 | (y & 0xF0)>>4);
	}

	
	

}	
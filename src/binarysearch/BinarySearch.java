package binarysearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BinarySearch 
{
 public static void main(String args[])
 {
	 try
	 {
		 FileReader fr =new FileReader("binary.txt");
		 BufferedReader br=new BufferedReader(fr);
		 String str;
		 while((str=br.readLine())!=null)
		 {
			 System.out.println(str+"\n");
		 }
	 }
	 catch(IOException e)
	 {
		 System.out.println("File not found");
	 }
	 
  }
}
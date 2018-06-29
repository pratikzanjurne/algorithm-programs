package insertion;
import java.util.Arrays;

import com.bridgelabz.utility.*;
public class Insertion {

public static void main(String[] args) 
{   
    Utility u=new Utility();
    int data;
    System.out.println("Enter string element size");
    data=u.getnumber();
    String[] input=u.getString(data);
    String[] result=u.insertionsort(input,data);
    System.out.println(Arrays.toString(input));
}
}
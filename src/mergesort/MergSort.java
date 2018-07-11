package mergesort;

import com.bridgelabz.utility.Utility;

class MergeSort
{
	public static void main(String args[])
    {
        int arr[];
        Utility u=new Utility();
        int n;
        System.out.println("Enter array size");
        n=u.getnumber();
        arr=u.getArray(n);
        System.out.println("Given Array : ");
        Utility.printArray(arr);
        u.mergesort(arr, 0, arr.length-1);
 
        System.out.println("Sorted array : ");
        u.printArray(arr);
    }
}

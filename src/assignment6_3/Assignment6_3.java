package assignment6_3;
/*
 * program to search an element in a one-dimensional array using Binary Search Algorithm.
 */
import java.util.Scanner;// importing Scanner Class
public class Assignment6_3 
{
	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); // Creating scanner object
		System.out.println("Enter Number of elements in array--");
		int n;
		n=s.nextInt(); // User input for number of elements in array
		int arr[]=new int[n];// Declaring an Integer array of size n
		System.out.println("Enter elements in array--");
		for(int i=0;i<n;i++)
		{
		arr[i]=s.nextInt(); // User input for Array
		}
		System.out.println("Enter element to be search in array--");
		int find=s.nextInt();  //user input for Element to search
		int index=search(arr,find); // Calling Binary Search Algorithm
		if(index!=-1)
		{
			System.out.println("Element found at index = " + index + " of the array");
		}
		else
		{
			System.out.println("Element not found in the array");
		}		
		s.close();// Scanner Object Close
	}//Close of Main Class
    public static int search(int a[],int find)  //Binary Search algorithm
    {
    	int start=0;
    	int end=a.length-1;
    	int mid;
    	while(start <= end)
    	{
    		mid=(start+end)/2;
    		if(a[mid]==find)
    		{
    			return mid;
    		}
    		else if(a[mid]<find)
    		{
    			start=mid+1;
    		}
    		else if(a[mid]>find)
    		{
    			end=mid-1;
    		}
    	}
    	return -1;
    }
}

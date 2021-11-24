package myArray;
import java.util.Scanner;

public class AverageofArray {
	public static void main(String[] args){
		int Size, i, Sum = 0;
		float average;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
			Sum = Sum + a[i];
		}   
	
		System.out.println("The Sum of All Elements in this Array = " + Sum);
        average = (float)Sum / Size;
       
        System.out.print("Average of the array elements is : " +average);
	}
}

package myArray;
import java.util.Scanner;

public class ProductofElements {
	public static void main(String[] args){
		int Size, i, Product = 1;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			Product = Product * a[i]; 
		}		
		System.out.println("The Product of All Elements in this Array = " + Product);
	}
}

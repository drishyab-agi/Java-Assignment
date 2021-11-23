package myString;
import java.util.Scanner;
public class EqualorNot {
	public static void main(String args[]) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		str1=sc.nextLine();
		System.out.println("Enter the second string:");
		str2=sc.nextLine();
		if(str1.equals(str2)){
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal:");
		}
		
	}
}

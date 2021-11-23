package myString;
import java.util.Scanner;
public class ConcatenateStrings {
	public static void main(String args[]) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		str1=sc.nextLine();
		System.out.println("Enter the second string:");
		str2=sc.nextLine();
		String str=str1.concat(str2);
		System.out.println(str);
	}

}

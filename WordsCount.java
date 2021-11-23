package myString;
import java.util.Scanner;
public class WordsCount {
	public static void main(String args[]) {
		String str;
		Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter the Sentence:");
	    str = sc.nextLine();
	
	    System.out.println("Number of Words = " + str.split(" ").length);
	    }

}

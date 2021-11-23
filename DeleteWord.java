package myString;
import java.util.Scanner;
public class DeleteWord {
	public static void main(String args[]) {
		String str1,str2,newSentence;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		str1=sc.nextLine();
		System.out.println("Enter the word which you want to delete:");
		str2=sc.nextLine();
		str1=str1.replaceAll(str2,"");
		System.out.println("New sentence is:" +str1);
	}

}

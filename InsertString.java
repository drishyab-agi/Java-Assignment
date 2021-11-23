package myString;
import java.lang.*;
public class InsertString {
	public static void main(String[] args) {
	      String str = "That's good!";
	      String newSub = "no ";
	      int index = 6;
	      System.out.println("Initial String = " + str);
	      System.out.println("Index where new string will be inserted = " + index);
	      StringBuffer resString = new StringBuffer(str);
	      resString.insert(index + 1, newSub);
	      System.out.println("Resultant String = "+resString.toString());
	   }
}

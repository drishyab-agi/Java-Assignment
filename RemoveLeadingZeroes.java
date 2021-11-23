package myString;
import java.util.Scanner;
public class RemoveLeadingZeroes {
	public static String removeLeadingZeroes(String num){
	      int i=0;
	      char charArray[] = num.toCharArray();
	      for( ; i<= charArray.length; i++){
	         if(charArray[i] != '0'){
	            break;
	         }
	      }
	      return (i == 0) ? num :num.substring(i);
	   }
	   public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter an integer: ");
	      String num = sc.next();

	      String result = RemoveLeadingZeroes.removeLeadingZeroes(num);
	      System.out.println(result);
	   }
}

package myString;
import java.util.Scanner;
public class CountCharacter {
	 public static void main(String[] args) {    
		 String str;
		 int i, length,counter[]= new int[200];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string:");
		 str=sc.next();
	
	     for(i = 0; i < str.length(); i++) {    
	    	 counter[(int) str.charAt(i)]++;
	     } 
	     for(i=0;i<200;i++) {
	    	 if(counter[i]!= 0) {
	    		 System.out.println((char) i +":" + counter[i]);
	    	 }
	     }
	            
	        
	}	
}

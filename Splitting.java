package myString;
public class Splitting{
	public static void main(String args[]) {
		String str = "WELCOME TO ARISGLOBAL";
		String[] temp;
		String delimeter = " ";
		temp = str.split(delimeter);
		      
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		    System.out.println("");
		    str = "WELCOME TO ARISGLOBAL";
		    delimeter = " ";
		    temp = str.split(delimeter);
		 }
		 for(int i = 0; i < temp.length; i++) {
			 System.out.println(temp[i]);
		     System.out.println("");
		     temp = str.split(delimeter,2);
		         
		     for(int j = 0; j < temp.length; j++){
		    	 System.out.println(temp[j]);
		     }
		 }
	}
	
}
package myString;

public class Iterate {
	public static void main(String[] args) {
		
	    String name = "Drishya";

	    System.out.println("Characters in " + name + " are:");

	    
	    for(int i = 0; i<name.length(); i++) {

	      char a = name.charAt(i);
	      System.out.print(a + ", ");
	    }
	  }

}

package myString;

public class DeleteSpace {
	public static void main(String args[]) {
		String str = "St Aloysius College Mangalore";
	    str = str.replaceAll("\\s","");
        System.out.println(str);
	}
}

package myString;

public class Lexicographic {
	public static void main(String[] args)
    {
        String s1 = "Drishya";
        String s2 = "Drishya";
        String s3 = "Kavya";
        String s4 = "ABC";
        System.out.println(" Comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}

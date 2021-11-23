package myString;

public class CheckStringisNumeric {
	public static void main(String[] args) {

        String string = "6783.65";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }

}

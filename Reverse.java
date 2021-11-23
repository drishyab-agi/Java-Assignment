package myString;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
        String input;
        String[] words;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        input = sc.nextLine();
        words = input.split(" ");
      
        System.out.println("Reversed Sentence:");
        for (i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

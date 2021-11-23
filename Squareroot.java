/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drishya
 */
import java.util.Scanner;

public class Squareroot {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("Please Enter Any Number to find Square Root = ");
		double num = sc.nextDouble();
		
		double temp, squareroot;
		
		squareroot = num / 2;
		
		do {
			temp = squareroot;
			squareroot = (temp + (num / temp))/2;
		} while((temp - squareroot) != 0);
		
		System.out.println("\nThe Square Root of the number is= " + squareroot);
	}
}

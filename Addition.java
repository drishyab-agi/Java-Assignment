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
public class Addition {
    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the first number: ");  
        int firstnum = sc.nextInt();
        System.out.print("Enter the second number: ");  
        int secondnum = sc.nextInt();
        int sum= firstnum+ secondnum;
        System.out.println("Sum: "+sum);  
    }
}
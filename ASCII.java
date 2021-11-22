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
public class ASCII {
    public static void main(String[] args)   {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        int ascii = ch;
        System.out.println("The Ascii value" + ch + " is " +ascii);
    }
}

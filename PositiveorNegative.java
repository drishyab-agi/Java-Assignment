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
public class PositiveorNegative {
    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int num = sc.nextInt();  
        if(num>0){
            System.err.println("Number is Positive");
        } 
        else{
            System.err.println("Number is Negative");
        }
        
    }
    
}
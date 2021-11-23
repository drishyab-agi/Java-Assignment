/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drishya
 */
/*import java.util.Scanner;  
public class Reverse{  
    public static void main(String[] args){  
        int reverse=0;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int number = sc.nextInt();  
        
       //while loop
        while(number != 0){  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        } 
       
       //For loop
        for(;number!=0;){
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }
        
        System.out.println("The reverse of the given number is: " + reverse);  
    }  
}  
*/

//using recursive function
import java.util.Scanner;  
public class Reverse{ 
    public static void reverse(int number){
        if(number<10){
            System.out.println(number);
            return;
        }
        else{
            System.out.println(number%10);
            reverse(number/10);
        }
    }
    
    public static void main(String[] args){  
        int reverse=0;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int number = sc.nextInt();  
        System.out.println("The reverse of the given number is:" );
        reverse(number);
    }
}
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
public class TriangleArea {
    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the breadth: ");  
        int b = sc.nextInt();
        System.out.print("Enter the height: ");  
        int h = sc.nextInt();
        float area;
        area = (1/2)*b*h;
        System.out.println("Area: "+area);  
    }
}

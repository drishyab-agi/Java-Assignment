/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drishya
 */
public class SwapNumbers {
 public static void main(String[] args) {
  int x = 40;
  int y = 20;
  System.out.println("Before Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
  x = x + y;
  y = x - y;
  x = x - y;
  System.out.println("After Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
 }
}

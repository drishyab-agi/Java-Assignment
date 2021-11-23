/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drishya
 */
public class ReverseString {
   public String reverseString(String str){
   
      if(str.isEmpty()){
         return str;
      } else {
         return reverseString(str.substring(1))+str.charAt(0);
      }
   }
   public static void main(String[] args) {
      ReverseString obj = new ReverseString();
      String result = obj.reverseString("ArisGlobal");
      System.out.println(result);
   }
}
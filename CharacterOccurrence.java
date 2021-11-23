/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drishya
 */
public class CharacterOccurrence {
   public static void main(String[] args) {
     String input="Welcome";
     char search = 'e';
     int count=0;
     for(int i=0; i<input.length();i++){
         if(input.charAt(i)==search)
             count++;
     }
       System.err.println("The character " +search+ "appears " +count+ " times");
   }
}

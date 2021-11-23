package myString;

public class GetChar {

    public static char
    getCharFromString(String str, int index)
    {
        return str.charAt(index);
    }
  
    public static void main(String[] args)
    {
  
        String str = "ArisGlobal";
 
        int index = 6;
     
        char ch = getCharFromString(str, index);
  
        System.out.println("Character from " + str + " at index " + index + " is " + ch);
    }

}

  
    
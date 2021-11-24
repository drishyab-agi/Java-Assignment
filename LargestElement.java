package myArray;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = {54, 34, 56, 20, 99};
		int i, max = arr[0];
		 for (i = 1; i < arr.length; i++)
             if (arr[i] > max)
                 max = arr[i];
		 System.out.println("Largest in given array is " + max);
	}
}

     
         
      
        
        
     
     
        
   
package myArray;

public class SecondSmallest {
	public static void main(String args[]){
	      int temp, size;
	      int array[] = {5,6,2,4,8,3,9};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("2nd Smallest element of the array is: "+array[0+1]);
	   }
}

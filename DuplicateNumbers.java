package myArray;

public class DuplicateNumbers {
	public static void main(String[] args) {
		
		int i = 0, j, dup_count = 0;
		int[] Dup_Count_arr = {3,5,7,3,6,7,9,3};
		
		while(i < Dup_Count_arr.length) 
		{
			j = i + 1;
			while(j < Dup_Count_arr.length)
			{		
				if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
					dup_count++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("\nThe Total Number of Duplicates: " + dup_count);
	}
	  
}


    
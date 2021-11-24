package myArray;

public class ReplaceElementwithProduct {
	static void ReplaceElements(int arr[], int n)
	{
		int prod = 1;

		for (int i = 0; i < n; ++i) {
			prod *= arr[i];
		}

		for (int i = 0; i < n; ++i) {
			arr[i] = prod / arr[i];
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 2, 4, 6, 3, 5 };
		int n = arr.length;

		ReplaceElements(arr, n);

		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");

	}

}




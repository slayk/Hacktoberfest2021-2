// Java code for linearly searching x in arr[]. If x is present then return its location, otherwise return -1
// It has a time complexity of O(n)

class LinearSearch
{
	public static int search(int arr[], int x)
	{
    // get the length of the array
		int n = arr.length;
    // parse the array and look for the element 
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = { 22, 31, 14, 10, 4 };
		int x = 10;

		// Function call for searching
		int result = search(arr, x);
		if (result == -1)
      // if it is not present, then it returns -1
			System.out.print("Element is not present in array");
		else
      // it is present
			System.out.print("Element is present at index "	+ result);
	}
}

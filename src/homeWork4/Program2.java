package homeWork4;

class Program2 {
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 10, 40, 90, 100, 1000, 2000, 3333};
        int result = binarySearch(arr, 0, arr.length - 1, 3333);


        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
	}
	 public static int binarySearch(int arr[], int l, int r, int x) {
        //Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices.
        if (r >= l && l < arr.length - 1) {

            int mid = l + (r - l) / 2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }



}
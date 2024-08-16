class BINARY_SEARCH {
  
    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int x)
    {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;       //the  main aim is to fing target value through mid

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                l = mid + 1;

            // If x is smaller, ignore right half
            else
                h = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
        BINARY_SEARCH ob = new BINARY_SEARCH();
        int arr[] = { 2, 3, 4, 10, 40 };
        
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "not present");
        else
            System.out.println(" present @ "
                               + "index " + result);
    }
}

//Time Complexity: O(log N)    This is a logarithmic time complexity, which means that the search time increases slowly as the array size increases.
                               // Binary search is more efficient than linear time (O(n)), especially for large values of n.
//Auxiliary Space: O(1)       which means it uses a constant amount of memory. This is because the algorithm only keeps track of the lower bound, upper bound, and middle elements,
                             //and these variables can be reused without creating new variables in memory on each iteration. 

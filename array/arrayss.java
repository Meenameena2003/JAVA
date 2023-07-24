class ArrayIndex {
  
    // Method returns the position of
    // arr[idx] after performing stable-sort
    // on array
    static int getIndexInSortedArray(int arr[],
                                     int n, int idx)
    {
        /*  Count of elements smaller than 
        current element plus the equal element
        occurring before given index*/
        int result = 0;
        for (int i = 0; i < n; i++) {
  
            // If element is smaller then
            // increase the smaller count
            if (arr[i] < arr[idx])
                result++;
  
            // If element is equal then increase
            // count only if it occurs before
            if (arr[i] == arr[idx] && i < idx)
                result++;
        }
        return result;
    }
  
    // Driver code to test above methods
    public static void main(String[] args)
    {
        int arr[] = { 3, 4, 3, 5, 2, 3, 4, 3, 1, 5 };
        int n = arr.length;
  
        int idxOfEle = 5;
        System.out.println(getIndexInSortedArray(arr,
                                                 n, idxOfEle));
    }
}
 
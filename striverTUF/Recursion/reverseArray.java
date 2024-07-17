public class Solution{
    //Function to print array
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
    }

    static void rec_reverse_array(int arr[], int start, int end){ //recursive way; O(n) time
        if (start < end) {
            int tmp = arr[start];       //swap elements from each end iterating toward the middle
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
         }
    }

    static void reverseArray(Integer arr[]) {   //built-in java functions; O(n) time
        //fetching array as list object
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
     }

    public static void main(String[] args){
        int n = 5;
      int arr[] = { 5, 4, 3, 2, 1};
      rec_reverse_array(arr, 0, n - 1);
      printArray(arr, n);
    }
}
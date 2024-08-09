class Sort{
    static void SelectionSort(int[] arr, int n){   //O(n^2)
        for (int i = 0; i < n - 1; i++) {
            int mini = i;   //starting minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {   //checking the rest of the array for a new minimum
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];   //swapping starting window w/ minimum
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    static void BubbleSort(int[] arr, int n){   //O(n^2) - best(n)
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;        //swap checker

            for (int j = 0; j <= i - 1; j++) {  //checking swapping the maximum to the last window position
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {     //if no swaps occured then the array is already in order
                break;
            }
        }
    }

    static void InsertionSort(int[] arr, int n){   //O(n^2) - best(n)
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {  //backtrack all the elements to find a swap
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    static void MergeSort(){        //Time:O(N*log_2(N)) space: O(N)
        public static void MSort(int[] arr, int low, int high){
            if(low >= high) //base case for a single element which is sorted
                return;
            int mid = (low+high)/2;
            MSort(arr, low, mid);   //left
            MSort(arr, mid+1, high); //right
            Merge(arr, low, mid, high);
        }

        public static void Merge(int[] arr, int low, int mid, int high){
            ArrayList<Integer> temp = new ArrayList<>(); // temporary array
            int left = low;      // starting index of left half of arr      //pointers to the beginning of each array
            int right = mid + 1;   // starting index of right half of arr
    
            //storing elements in the temporary array in a sorted manner//
            while (left <= mid && right <= high) {  //if either of the pointers runs out of range then break
                if (arr[left] <= arr[right]) {  //left array pointer is smaller 
                    temp.add(arr[left]);
                    left++;
                } else {                        //right array pointer is smaller
                    temp.add(arr[right]);
                    right++;
                }
            }
    
            // if elements on the left half are still left //
            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }
    
            //  if elements on the right half are still left //
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }
    
            // transfering all elements from temporary to arr //
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
        }
    }
}
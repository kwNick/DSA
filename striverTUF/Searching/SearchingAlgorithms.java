import java.util.*;

public class Search{
    private static int LinearSearch(int[] arr,int n,int num) {  //O(N) Time Complexity
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==num)
            return i;
        }
        return -1;
    }


    //Binary search is only applicable in a sorted search space. The sorted search space does not necessarily have to be a sorted array. It can be anything but the search space must be sorted.
    //In binary search, we generally divide the search space into two equal halves and then try to locate which half contains the target. According to that, we shrink the search space size.
    public static int binarySearch(int[] nums, int target) {    //O(logN) Time Complexity 
        int n = nums.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
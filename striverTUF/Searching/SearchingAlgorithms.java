import java.util.*;

public class Search{
    private static int LinearSearch(int[] arr,int n,int num) {
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==num)
            return i;
        }
        return -1;
    }
}
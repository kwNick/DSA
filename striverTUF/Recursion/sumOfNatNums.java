public class Solution{
    public static void main(String[] args){
        solve(5);
        solve(6);
    }

    public static void solve(int n){
        int sum = n*(n+1)/2         //O(1) time complexity
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }

    static void recursion_way(int i, int sum){   //recursion way; O(n) time
        // Base Condition.
        if(i<1){
            System.out.println(sum);
            return;
        }
        // Function call to increment sum by i till i decrements to 1.
        func(i-1,sum+i);
    }

    static int funct_way(int n){    //functional way; O(n) time
        if(n == 0){
            return 0;
        }
        return n + funct_way(n-1);
    }
}
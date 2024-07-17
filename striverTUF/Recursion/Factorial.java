public class Solution{
    static int fact_recursion(int n){       //recursion way; O(n) time
        if(n == 0){
            return 1;
        }
        return n*fact_recursion(n-1);
    }
    public static void main(String[] args){     //
        System.out.println(fact_recursion(5));
    }
}
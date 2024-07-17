public class solution{

    static boolean rec_palindrome(int i, String s){     //recusive way; O(n) time

        // Base Condition
        // If i exceeds half of the string, means all the elements 
        // are compared, we return true.
        if(i >= s.length()/2){
            return true;
        }

        // If start is not equal to end, not palindrome.
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        return palindrome(i+1, s);
    }

    public static void main(String[] args){
        String s = "madam";
        System.out.println(rec_palindrome(0,s));
    }
}
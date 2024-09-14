public class Palindrome {

    static private boolean isPalindrome(String s) { // iterative way - O(n) time and O(1) space
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    static boolean rec_palindrome(int i, String s) { // recusive way; O(n) time

        // Base Condition
        // If i exceeds half of the string, means all the elements
        // are compared, we return true.
        if (i >= s.length() / 2) {
            return true;
        }

        // If start is not equal to end, not palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return rec_palindrome(i + 1, s);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(rec_palindrome(0, s));
    }
}
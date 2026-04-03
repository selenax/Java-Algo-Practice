package recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("ac"));
        System.out.println(palindrome("aba"));
        System.out.println(palindrome("abab"));
        System.out.println(palindrome("ababa"));
        System.out.println(palindrome(""));
    }
    public static boolean palindrome(String word) {
          return palindromeHelper(0, word.length()-1, word);
    }

    private static boolean palindromeHelper(int start, int end, String word) {
        if(start > end) {
            return true;
        }
        if(word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return palindromeHelper(start + 1, end - 1, word);
    }
}
